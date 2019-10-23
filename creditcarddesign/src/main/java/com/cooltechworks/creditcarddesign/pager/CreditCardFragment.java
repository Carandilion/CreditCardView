package com.cooltechworks.creditcarddesign.pager;

import android.text.TextWatcher;

import androidx.fragment.app.Fragment;

/**
 * Created by sharish on 9/1/15.
 */
public abstract class CreditCardFragment extends Fragment implements TextWatcher, IFocus {

    private IActionListener mActionListener;

    void setActionListener(IActionListener listener) {
        mActionListener = listener;
    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {

    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {

    }


    void onEdit(String edit) {

        if (mActionListener != null) {
            mActionListener.onEdit(this, edit);
        }

    }

    void onComplete() {

        if (mActionListener != null) {
            mActionListener.onActionComplete(this);
        }

    }

}
