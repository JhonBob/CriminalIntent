package com.bob.marschen.criminalintent;

import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by Administrator on 2015/7/4.
 */
public class ImageFragment extends DialogFragment {
    private static final String EXTRA_IMAGE_PATH="com.bob.marschen.criminalintent.image_path";
    private ImageView mimageView;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        mimageView=new ImageView(getActivity());
        String path=(String)getArguments().getSerializable(EXTRA_IMAGE_PATH);
        BitmapDrawable image=PictureUtils.getScaledDrawable(getActivity(),path);
        mimageView.setImageDrawable(image);
        return mimageView;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        PictureUtils.cleanImageView(mimageView);
    }

    public static ImageFragment newInstance(String imagePath){
        Bundle args=new Bundle();
        args.putSerializable(EXTRA_IMAGE_PATH,imagePath);
        ImageFragment fragment=new ImageFragment();
        fragment.setArguments(args);
        fragment.setStyle(DatePickerFragment.STYLE_NO_TITLE,0);
        return  fragment;
    }
}
