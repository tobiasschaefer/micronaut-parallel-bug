package temp;

import io.micronaut.context.annotation.Context;
import io.micronaut.context.annotation.Factory;
import io.micronaut.context.annotation.Parallel;

import javax.inject.Named;
import javax.inject.Singleton;

@Factory
public class MyFactory {

    @Context
    @Parallel
    @Singleton
    @Named("1")
    Foo foo1() {
        try {
            System.out.println("foo1: starting");
            Thread.sleep(5000);
            System.out.println("foo1: completed");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new Foo();
    }

    @Context
    @Parallel
    @Singleton
    @Named("2")
    Foo foo2() {
        try {
            System.out.println("foo2: starting");
            Thread.sleep(5000);
            System.out.println("foo2: completed");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new Foo();
    }
}
