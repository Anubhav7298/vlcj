/*
 * This file is part of VLCJ.
 *
 * VLCJ is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * VLCJ is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with VLCJ.  If not, see <http://www.gnu.org/licenses/>.
 *
 * Copyright 2009-2019 Caprica Software Limited.
 */

package uk.co.caprica.vlcj.enums;

import java.util.HashMap;
import java.util.Map;

/**
 * Enumeration of media parsed statuses.
 */
public enum MediaParsedStatus {

    SKIPPED(1),
    FAILED (2),
    TIMEOUT(3),
    DONE   (4);

    private static final Map<Integer, MediaParsedStatus> INT_MAP = new HashMap<Integer, MediaParsedStatus>();

    static {
        for (MediaParsedStatus value : MediaParsedStatus.values()) {
            INT_MAP.put(value.intValue, value);
        }
    }

    public static MediaParsedStatus mediaParsedStatus(int intValue) {
        return INT_MAP.get(intValue);
    }

    private final int intValue;

    MediaParsedStatus(int intValue) {
        this.intValue = intValue;
    }

    public int intValue() {
        return intValue;
    }

}
