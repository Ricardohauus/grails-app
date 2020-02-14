package com.schoolofnet

class HomeController {

	def index() {
		Person person = new Person(firstName: 'Ricardo', lastName: 'Silva',age: 23);
		[ person : person ]
	}

	def greeting() {
		render "Hello from School of net"
	}
}
