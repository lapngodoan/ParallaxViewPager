package com.luxsyp.ParallaxViewPager.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.luxsyp.ParallaxViewPager.R;

/**
 * Created with IntelliJ IDEA.
 * User: luxsypher
 * Date: 07/04/14
 * Time: 00:04
 * To change this template use File | Settings | File Templates.
 */
public class HorizontalFragment extends ParallaxFragment {

    public static final String EXTRA_MESSAGE = "EXTRA_MESSAGE";

    public static final HorizontalFragment newInstance(String message) {
        HorizontalFragment f = new HorizontalFragment();
        Bundle bdl = new Bundle(1);
        bdl.putString(EXTRA_MESSAGE, message);
        f.setArguments(bdl);
        return f;

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        String message = getArguments().getString(EXTRA_MESSAGE);
        View v = inflater.inflate(R.layout.horizontal_fragment_layout, container, false);
        TextView messageTextView = (TextView) v.findViewById(R.id.textView);
        messageTextView.setText(message);

        // register view for Parralax
        addViewToParallax(messageTextView, 2.5f);

        return v;
    }
}