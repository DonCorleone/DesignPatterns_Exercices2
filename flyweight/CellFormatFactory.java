package com.codewithmosh.flyweight;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class CellFormatFactory {
    Map<Integer, CellFormat> _cache = new HashMap<Integer, CellFormat>();

    public CellFormat getCellFormat(String fontFamily, int fontSize, boolean isBold){

        var hashCode = Objects.hash(fontFamily, fontSize, isBold);
        if (!_cache.containsKey(hashCode)){

            _cache.put(hashCode, new CellFormat(fontFamily, fontSize, isBold));
        }
        return _cache.get(hashCode);
    }
}
