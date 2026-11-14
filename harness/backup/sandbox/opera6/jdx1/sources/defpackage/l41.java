package defpackage;

import android.content.ClipData;
import android.graphics.fonts.Font;
import android.hardware.camera2.params.InputConfiguration;
import android.hardware.camera2.params.MultiResolutionStreamInfo;
import android.view.ContentInfo;
import android.view.inputmethod.SurroundingText;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract /* synthetic */ class l41 {
    public static /* synthetic */ Font.Builder a(Font font) {
        return new Font.Builder(font);
    }

    public static /* synthetic */ InputConfiguration b(int i, ArrayList arrayList) {
        return new InputConfiguration(arrayList, i);
    }

    public static /* synthetic */ MultiResolutionStreamInfo c(int i, int i2, String str) {
        return new MultiResolutionStreamInfo(i, i2, str);
    }

    public static /* synthetic */ ContentInfo.Builder d(ClipData clipData, int i) {
        return new ContentInfo.Builder(clipData, i);
    }

    public static /* synthetic */ SurroundingText e(int i, int i2, int i3, CharSequence charSequence) {
        return new SurroundingText(charSequence, i, i2, i3);
    }

    public static /* synthetic */ void f() {
    }

    public static /* synthetic */ void g() {
    }
}
