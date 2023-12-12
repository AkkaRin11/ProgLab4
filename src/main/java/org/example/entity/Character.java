package org.example.entity;

import org.example.Data.Emotion;
import org.example.interf.Thinker;

public abstract class Character extends Entity implements Thinker {
    public abstract void experiencingEmotions(Emotion emotion);
}
