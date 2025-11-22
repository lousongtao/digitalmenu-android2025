package com.shuishou.digitalmenu.ui.components;

import android.content.Context;
import android.util.AttributeSet;

/**
 * 在DishCellComponent中使用, 根据dishname的长度, 使用不同大小的字体
 * Created by Administrator on 2017/1/24.
 */

public class DishNameTextView extends ChangeLanguageTextView {
    public DishNameTextView(Context context){
        super(context);
    }

    public DishNameTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

}
