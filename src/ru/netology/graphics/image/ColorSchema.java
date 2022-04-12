package ru.netology.graphics.image;

public class ColorSchema implements TextColorSchema {
    @Override
    public char convert(int color) {
        char[] asciiSymbols = {'▇', '●', '◉', '◍', '◎', '○', '☉', '◌', '-'};
        //char[] asciiSymbols = {'#', '$', '@', '%', '*', '+', '-'};
        return asciiSymbols[color / (255 / (asciiSymbols.length - 1))];
    }
}
