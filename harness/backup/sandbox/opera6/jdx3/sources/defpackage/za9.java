package defpackage;

import android.content.SharedPreferences;
import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.compat.quirk.CaptureIntentPreviewQuirk;
import androidx.camera.camera2.compat.quirk.ImageCaptureFailedForVideoSnapshotQuirk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class za9 implements fel, qyl {
    public boolean a;
    public boolean b;

    public za9(ygh yghVar) {
        ArrayList arrayListC = yghVar.c(CaptureIntentPreviewQuirk.class);
        int size = arrayListC.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            Object obj = arrayListC.get(i);
            i++;
            if (((CaptureIntentPreviewQuirk) obj).b()) {
                z = true;
                break;
            }
        }
        this.a = z;
        this.b = yghVar.a(ImageCaptureFailedForVideoSnapshotQuirk.class);
    }

    public /* synthetic */ za9(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final Map a(wwh wwhVar) {
        return (wwhVar != null && wwhVar.a == 3 && this.a) ? Collections.singletonMap(CaptureRequest.CONTROL_CAPTURE_INTENT, 1) : (wwhVar != null && wwhVar.a == 4 && this.b) ? Collections.singletonMap(CaptureRequest.CONTROL_CAPTURE_INTENT, 2) : n08.a;
    }

    @Override // defpackage.qyl
    public final Boolean b() {
        return null;
    }

    @Override // defpackage.qyl
    public final yn0 c() {
        return yn0.l;
    }

    public final void d(ru9 ru9Var) {
        if (this.b && this.a) {
            this.a = false;
            int i = ru9Var.a.getBoolean("startpage.installed_with_minigame", false) ? 3 : 2;
            int i2 = ru9Var.a.getInt("startpage.minigame_entry_point_impressions", 0);
            Integer numValueOf = Integer.valueOf(i2);
            if (i2 >= i) {
                numValueOf = null;
            }
            if (numValueOf != null) {
                int iIntValue = numValueOf.intValue();
                nv6 nv6VarB = ru9Var.b();
                ((SharedPreferences.Editor) nv6VarB.a).putInt("startpage.minigame_entry_point_impressions", iIntValue + 1);
                nv6VarB.w();
            }
        }
    }

    @Override // defpackage.qyl
    public final boolean e() {
        return this.b;
    }

    @Override // defpackage.qyl
    public final String f() {
        return "";
    }

    @Override // defpackage.qyl
    public final boolean g() {
        return false;
    }

    @Override // defpackage.qyl
    public final boolean h() {
        return this.a;
    }

    @Override // defpackage.qyl
    public final zn0 i() {
        return zn0.c;
    }

    @Override // defpackage.qyl
    public final boolean j() {
        return false;
    }
}
