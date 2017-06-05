package com.chance.sync;

/**
 * 这个就相当于Class A
 * @author xiaanming
 * 实现了 OnClickListener接口---->背景一
 */
public class MainActivity extends Activity implements OnClickListener{
    /**
     * Class A 包含Class B的引用----->背景二
     */
    private Button button;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        button = (Button)findViewById(R.id.button1);

        /**
         * Class A 调用View的方法,而Button extends View----->A类调用B类的某个方法 C
         */
        button.setOnClickListener(this);
    }

    /**
     * 用户点击Button时调用的回调函数，你可以做你要做的事
     * 这里我做的是用Toast提示OnClick
     */
    @Override
    public void onClick(View v) {
//        Toast.makeText(getApplication(), "OnClick", Toast.LENGTH_LONG).show();
    }

}