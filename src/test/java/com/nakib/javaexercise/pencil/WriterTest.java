package com.nakib.javaexercise.pencil;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WriterTest {


    @Test
    public void write() {
        Writer writer = new Writer("", null, 0);

        writer.appendText("She sells sea shells");

        Assertions.assertEquals("She sells sea shells", writer.getText());

        writer.appendText(" on the seashore");

        Assertions.assertEquals("She sells sea shells on the seashore", writer.getText());
    }

    @Test
    public void durability_4()  {
        Writer writer = new Writer("", 4, 0);

        writer.appendText("Text");

        Assertions.assertEquals("Tex ", writer.getText());

        writer = new Writer("", 4, 0);

        writer.appendText("text a");

        Assertions.assertEquals("text  ", writer.getText());

        writer = new Writer("", 4, 0);

        writer.appendText("TEXT");

        Assertions.assertEquals("TE  ", writer.getText());
    }

    @Test
    public void sharpen_4_durability()  {
        Writer writer = new Writer("", 4, 3);

        writer.appendText("text a");

        Assertions.assertEquals("text a", writer.getText());

        writer.appendText("pples and pears");

        Assertions.assertEquals("text apples and pea  ", writer.getText());
    }
}
