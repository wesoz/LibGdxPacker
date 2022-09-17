package com.mygdx.game;

import com.badlogic.gdx.tools.texturepacker.TexturePacker;

public class MyPacker {
    public static void main(String args[]) throws Exception {
        TexturePacker.process("assets/Player", "assets/Player Finished", "Player Animation.png");
    }
}
