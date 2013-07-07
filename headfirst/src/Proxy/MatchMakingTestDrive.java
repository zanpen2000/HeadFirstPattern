package Proxy;

import java.util.ArrayList;
import java.util.Iterator;

import java.lang.reflect.*;

public class MatchMakingTestDrive {

	ArrayList<PersonBean> persons;

	public static void main(String[] args) {
		MatchMakingTestDrive test = new MatchMakingTestDrive();
		test.drive();
	}

	public MatchMakingTestDrive() {
		initializeDatabase();
	}

	private void initializeDatabase() {
		persons = new ArrayList<PersonBean>();
		PersonBean personBean = new PersonBeanImpl();
		personBean.setName("Joe Javabean");
		personBean.setGender("male");
		personBean.setInterests("Drinking");
		personBean.setHotOrNotRating(2);
		persons.add(personBean);
	}

	public void drive() {
		PersonBean joe = getPersonFromDatabase("Joe Javabean");
		PersonBean ownerProxy = getOwnerProxy(joe);
		System.out.println("Name is " + ownerProxy.getName());
		ownerProxy.setInterests("bowling, go");

		System.out.println("Interests set from owner proxy");

		try {
			ownerProxy.setHotOrNotRating(10);
		} catch (Exception e) {
			System.out.println("Can't set rating from owner proxy");
		}

		System.out.println("Rating is " + ownerProxy.getHotOrNotRating());

		PersonBean nonOwnerProxy = getNonOwnerProxy(joe);
		System.out.println("Name is " + nonOwnerProxy.getName());
		try {
			nonOwnerProxy.setInterests("bowling, Go");
		} catch (Exception e) {
			System.out.println("Can't set interests from non owner proxy");
		}
		nonOwnerProxy.setHotOrNotRating(3);

		System.out.println("Rating set from non owner proxy");
		System.out.println("Rating is " + nonOwnerProxy.getHotOrNotRating());
	}

	private PersonBean getNonOwnerProxy(PersonBean joe) {
		return (PersonBean) Proxy.newProxyInstance(joe.getClass()
				.getClassLoader(), joe.getClass().getInterfaces(),
				new NonOwnerInvocationHandler(joe));
	}

	private PersonBean getOwnerProxy(PersonBean joe) {
		return (PersonBean) Proxy.newProxyInstance(joe.getClass()
				.getClassLoader(), joe.getClass().getInterfaces(),
				new OwnerInvocationHandler(joe));
	}

	private PersonBean getPersonFromDatabase(String string) {
		for (Iterator<PersonBean> iter = persons.iterator(); iter.hasNext();) {
			PersonBean person = (PersonBean) iter.next();
			if (person.getName().equals(string))
				return person;
		}
		return null;
	}
}
