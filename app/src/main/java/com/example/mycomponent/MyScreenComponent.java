package com.example.mycomponent;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MyScreenComponent extends ConstraintLayout {

    private ImageView infoImage;
    private Button message;
    private TextView messageDetail;

    public MyScreenComponent(Context context) {
        super(context);
    }

    public MyScreenComponent(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(attrs, context);
    }

    public MyScreenComponent(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(attrs, context);
    }

    private void init(@Nullable AttributeSet attrs, Context context) {
        inflate(context, R.layout.my_screen_component, this);

        infoImage = findViewById(R.id.infoImage);
        message = findViewById(R.id.message);
        messageDetail = findViewById(R.id.messageDetail);

        TypedArray attributes = context.getTheme().obtainStyledAttributes(
                attrs, R.styleable.MyScreenComponent, 0, 0
        );

        infoImage.setImageDrawable(attributes.getDrawable(R.styleable.MyScreenComponent_imgInfo));
        message.setText(attributes.getText(R.styleable.MyScreenComponent_messageInfo));
        messageDetail.setText(attributes.getText(R.styleable.MyScreenComponent_messageDescription));
        attributes.recycle();
    }
}
