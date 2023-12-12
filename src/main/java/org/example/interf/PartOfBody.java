package org.example.interf;

import org.example.entity.Entity;

public interface PartOfBody {
    void touch(Entity entity);
    void touchCarefully(Entity entity);

    void touchNoMention(String appeal);

    void touchCarefullyNoMention(String appeal);
}
