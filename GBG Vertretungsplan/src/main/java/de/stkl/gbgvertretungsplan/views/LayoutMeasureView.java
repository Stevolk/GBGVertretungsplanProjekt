/*
 * Copyright (c) 2014 Steffen Klee
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

package de.stkl.gbgvertretungsplan.views;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/**
 * Created by Steffen Klee on 29.04.2014.
 */
public class LayoutMeasureView extends LinearLayout {
    public static int w = 0, h = 0, screenW, screenH;

    public LayoutMeasureView(Context context) {
        super(context);
    }

    public LayoutMeasureView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public LayoutMeasureView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);

        // w is ALWAYS the width in portrait mode!
        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT) {
            w = getMeasuredWidth();
            h = getMeasuredHeight();
        } else {
            w = getMeasuredHeight();
            h = getMeasuredWidth();
        }
    }
}
