package Singleton;

public class ChocolateBoiler {

	private boolean empty;
	private boolean boiled;

	private ChocolateBoiler() {
		empty = true;
		boiled = false;
	}

	/* 单件实现 begin */
	// 方式1：同步模式
	// public static ChocolateBoiler uniqueInstance;
	//
	// public static synchronized ChocolateBoiler getInstance() {
	// if (uniqueInstance != null)
	// uniqueInstance = new ChocolateBoiler();
	// return uniqueInstance;
	// }
	//

	// 方式2：急切模式
	// private static ChocolateBoiler uniqueInstance = new ChocolateBoiler();
	//
	// public static ChocolateBoiler getInstance()
	// {
	// return uniqueInstance;
	// }

	// 双重检查加锁

	private volatile static ChocolateBoiler uniqueInstance;

	public static ChocolateBoiler getInstance() {
		if (uniqueInstance == null) {
			synchronized (ChocolateBoiler.class) {
				if (uniqueInstance == null) {
					uniqueInstance = new ChocolateBoiler();
				}
			}
		}
		return uniqueInstance;
	}

	/* 单件实现 end. */

	public void fill() {
		if (isEmpty()) {
			empty = false;
			boiled = false;
		}
	}

	public void drain() {
		if (!isEmpty() && isBoiled()) {
			empty = true;
		}
	}

	public void boil() {
		if (!isEmpty() && !isBoiled()) {
			boiled = true;
		}
	}

	public boolean isEmpty() {
		return empty;
	}

	public boolean isBoiled() {
		return boiled;
	}
}
