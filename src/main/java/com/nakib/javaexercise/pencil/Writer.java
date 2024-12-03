package com.nakib.javaexercise.pencil;

public class Writer {
    private String initialPadString;
    private Integer durability;
    private Integer sharpenability;
    private Integer initialDurability;

    public Writer(String initialPadString, Integer durability, Integer sharpenability ) {
        this.initialPadString = initialPadString;
        this.durability = durability;
        this.initialDurability = durability;
        this.sharpenability = sharpenability;
    }

    public String getText() {
        return initialPadString;
    }

    public void appendText(String text)  {
        StringBuilder sb = new StringBuilder(initialPadString);

        char[] c = text.toCharArray();

        for(int i = 0; i< c.length; i++)    {
            if(durability == null || durability != 0)   {
                sb.append(c[i]);

                if(durability != null)  {
                    if(Character.isUpperCase(c[i])) {
                       durability = durability -2;
                    }

                    if(Character.isLowerCase(c[i])) {
                        durability--;
                    }

                }
            } else {
                sb.append(' ');
            }

            if (this.durability != null && this.durability == 0)    {
                this.sharpen();
            }
        }

        initialPadString = sb.toString();
    }

    public void sharpen()   {
        if(sharpenability > 0)     {
            durability = initialDurability;
            sharpenability--;
        }
    }
}
