// Generated by view binder compiler. Do not edit!
package com.example.profilepage.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.example.profilepage.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageButton aboutmebtn;

  @NonNull
  public final ImageButton emailbtn;

  @NonNull
  public final ImageView imageView;

  @NonNull
  public final ImageButton namebtn;

  @NonNull
  public final ImageButton phonebtn;

  @NonNull
  public final TextView textEmail;

  @NonNull
  public final TextView textName;

  @NonNull
  public final TextView textPhone;

  @NonNull
  public final TextView textView;

  @NonNull
  public final TextView textaboutme;

  private ActivityMainBinding(@NonNull ConstraintLayout rootView, @NonNull ImageButton aboutmebtn,
      @NonNull ImageButton emailbtn, @NonNull ImageView imageView, @NonNull ImageButton namebtn,
      @NonNull ImageButton phonebtn, @NonNull TextView textEmail, @NonNull TextView textName,
      @NonNull TextView textPhone, @NonNull TextView textView, @NonNull TextView textaboutme) {
    this.rootView = rootView;
    this.aboutmebtn = aboutmebtn;
    this.emailbtn = emailbtn;
    this.imageView = imageView;
    this.namebtn = namebtn;
    this.phonebtn = phonebtn;
    this.textEmail = textEmail;
    this.textName = textName;
    this.textPhone = textPhone;
    this.textView = textView;
    this.textaboutme = textaboutme;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.aboutmebtn;
      ImageButton aboutmebtn = rootView.findViewById(id);
      if (aboutmebtn == null) {
        break missingId;
      }

      id = R.id.emailbtn;
      ImageButton emailbtn = rootView.findViewById(id);
      if (emailbtn == null) {
        break missingId;
      }

      id = R.id.imageView;
      ImageView imageView = rootView.findViewById(id);
      if (imageView == null) {
        break missingId;
      }

      id = R.id.namebtn;
      ImageButton namebtn = rootView.findViewById(id);
      if (namebtn == null) {
        break missingId;
      }

      id = R.id.phonebtn;
      ImageButton phonebtn = rootView.findViewById(id);
      if (phonebtn == null) {
        break missingId;
      }

      id = R.id.textEmail;
      TextView textEmail = rootView.findViewById(id);
      if (textEmail == null) {
        break missingId;
      }

      id = R.id.textName;
      TextView textName = rootView.findViewById(id);
      if (textName == null) {
        break missingId;
      }

      id = R.id.textPhone;
      TextView textPhone = rootView.findViewById(id);
      if (textPhone == null) {
        break missingId;
      }

      id = R.id.textView;
      TextView textView = rootView.findViewById(id);
      if (textView == null) {
        break missingId;
      }

      id = R.id.textaboutme;
      TextView textaboutme = rootView.findViewById(id);
      if (textaboutme == null) {
        break missingId;
      }

      return new ActivityMainBinding((ConstraintLayout) rootView, aboutmebtn, emailbtn, imageView,
          namebtn, phonebtn, textEmail, textName, textPhone, textView, textaboutme);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}