package by.tc.task01.entity;

import by.tc.task01.entity.criteria.SearchCriteria;
import by.tc.task01.entity.enums.Color;

/**
 * Represents the TabletPC appliance
 */
public class TabletPC extends Appliance{
    public int batteryCapacity;
    public int displayInches;
    public int memoryRom;
    public int flashMemoryCapacity;
    public Color color;


    @Override
    public String toString() {
        return String.format("TabletPC : BATTERY_CAPACITY=%d, DISPLAY_INCHES=%d, MEMORY_ROM=%d, FLASH_MEMORY_CAPACITY=%d, COLOR=%s",
                batteryCapacity, displayInches, memoryRom, flashMemoryCapacity, color.toString());
    }

    /**
     *
     * @param key field to match for
     * @param value value of field
     * @return
     */
    @Override
    public boolean matches(String key, Object value) {
        return switch (SearchCriteria.TabletPC.valueOf(key)){
            case BATTERY_CAPACITY -> batteryCapacity == (Integer) value;
            case DISPLAY_INCHES -> displayInches ==  (Integer) value;
            case MEMORY_ROM -> memoryRom == (Integer) value;
            case FLASH_MEMORY_CAPACITY -> flashMemoryCapacity == (Integer) value;
            case COLOR -> color == Color.valueOf((String) value);
        };
    }
}
