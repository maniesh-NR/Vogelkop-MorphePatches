package defpackage;

import android.view.View;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class is7 {
    public final int[] a;

    public is7() {
        this.a = new int[2];
    }

    public is7(int[] iArr) {
        this.a = iArr;
    }

    public final JSONObject a(View view) {
        if (view == null) {
            return yqo.a(0, 0, 0, 0);
        }
        int width = view.getWidth();
        int height = view.getHeight();
        int[] iArr = this.a;
        view.getLocationOnScreen(iArr);
        return yqo.a(iArr[0], iArr[1], width, height);
    }
}
