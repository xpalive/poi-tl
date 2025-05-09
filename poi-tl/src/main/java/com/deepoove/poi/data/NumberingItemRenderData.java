/*
 * Copyright 2014-2025 Sayi
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.deepoove.poi.data;

import java.io.Serializable;

public class NumberingItemRenderData implements Serializable {

    public static final int LEVEL_NORMAL = -1;

    private static final long serialVersionUID = 1L;

    // improved: Support DocumentRenderData
    private ParagraphRenderData item;
    private int level;

    public NumberingItemRenderData(int level, ParagraphRenderData item) {
        this.level = level;
        this.item = item;
    }

    public ParagraphRenderData getItem() {
        return item;
    }

    public void setItem(ParagraphRenderData item) {
        this.item = item;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

}
