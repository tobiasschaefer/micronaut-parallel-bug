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
            Thread.sleep(5000);
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
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new Foo();
    }
}
