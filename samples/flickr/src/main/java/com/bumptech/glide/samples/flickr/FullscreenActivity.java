package com.bumptech.glide.samples.flickr;

import static com.bumptech.glide.request.RequestOptions.fitCenterTransform;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.widget.ImageView;
import com.bumptech.glide.samples.flickr.api.Photo;

/**
 * A simple activity for viewing a single photo.
 */
public class FullscreenActivity extends FragmentActivity {
  private static final String ARG_PHOTO = "photo";

  public static Intent getIntent(Context context, Photo photo) {
    Intent intent = new Intent(context, FullscreenActivity.class);
    intent.putExtra(ARG_PHOTO, photo);
    return intent;
  }

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.fullscreen_activity);
    ImageView fullscreenView = (ImageView) findViewById(R.id.fullscreen_view);
    Photo photo = getIntent().getParcelableExtra(ARG_PHOTO);

    GlideApp.with(this).load("https://expertbudowy.pl/xellacompass-srv/api/v1/profile-image/46/public_file?hash=bf972930486979a57ab23c4ccbbdac61").apply(fitCenterTransform()).into(fullscreenView);
  }
}
