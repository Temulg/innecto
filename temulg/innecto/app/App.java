/*
 * Copyright (c) 2018 Alex Dubov <oakad@yahoo.com>
 *
 * SPDX-License-Identifier: GPL-3.0-or-later
 */

package temulg.innecto.app;

public class App {
	public static void main(String[] args) {
		System.out.println("Boooo! Booooo!");
		var z = (Object)"aaa";
		switch (z) {
		case String s -> System.out.println("iippii " + s);
		case Integer x -> {}
		default -> System.out.println("zzzz");
		}
	}
}
