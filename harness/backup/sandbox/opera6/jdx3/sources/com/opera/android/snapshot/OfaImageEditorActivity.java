package com.opera.android.snapshot;

import android.os.Bundle;
import android.view.KeyEvent;
import com.opera.hype.image.editor.ImageEditorActivity;
import defpackage.c37;
import defpackage.ozk;

/* loaded from: classes.dex */
public class OfaImageEditorActivity extends ImageEditorActivity {
    public static final /* synthetic */ int e = 0;

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (c37.r().l(4, keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.opera.hype.image.editor.ImageEditorActivity
    public final void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        Bundle extras = getIntent().getExtras();
        if (extras == null || (i = extras.getInt("theme_id")) == 0) {
            return;
        }
        setTheme(i);
        ozk.a(getTheme(), extras.getBoolean("follow_system_font", false));
    }
}
