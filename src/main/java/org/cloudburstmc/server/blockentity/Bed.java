package org.cloudburstmc.server.blockentity;

import org.cloudburstmc.server.utils.data.DyeColor;

public interface Bed extends BlockEntity {

    DyeColor getColor();

    void setColor(DyeColor color);
}
