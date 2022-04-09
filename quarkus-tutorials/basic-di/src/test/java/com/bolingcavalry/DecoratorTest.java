package com.bolingcavalry;

import com.bolingcavalry.decorator.Coffee;
import com.bolingcavalry.event.producer.MyProducer;
import com.bolingcavalry.event.producer.TwoChannelWithSingleEvent;
import com.bolingcavalry.event.producer.TwoChannelWithTwoEvent;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

@QuarkusTest
public class DecoratorTest {

    @Inject
    Coffee coffee;

    @Test
    public void testDecoratorPrice() {
        Assertions.assertEquals(6, coffee.getPrice());
    }
}
