// I believe in you. You can do the thing!

// It’s only a thought, and a thought can be changed.

// Deep at the center of my being is an infinite well of love.

// You're good enough, you're smart enough, and doggone it, people like you.

package com.ubs;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
class Wednesday1Controller {

    @RequestMapping(method = GET, path = "/")
    public String root() {
        return "App running: Served from " + getClass().getName();
    }

    @RequestMapping(method = GET, path = "hello/{name}")
    public String person(@PathVariable String name) {
        return "Hello " + name + "!";
    }

}
