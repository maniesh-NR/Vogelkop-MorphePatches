package defpackage;

import android.content.Context;
import android.graphics.Path;
import android.util.SparseArray;
import com.opera.android.settings.SettingsManager;

/* loaded from: classes.dex */
public final class gjf {
    public final SparseArray a = new SparseArray();
    public final SparseArray b = new SparseArray();
    public final SparseArray c = new SparseArray();
    public final hjf d;
    public final SettingsManager e;

    public gjf(hjf hjfVar, SettingsManager settingsManager) {
        this.d = hjfVar;
        this.e = settingsManager;
    }

    public static gjf a(Context context) {
        gjf gjfVar = (gjf) context.getSystemService("com.opera.android.graphics.MASK_PROVIDER_SERVICE");
        if (gjfVar != null) {
            return gjfVar;
        }
        qp2.g("Trying to use a Context without support?");
        return null;
    }

    public final bcd b(int i, int i2) {
        Path pathI;
        SettingsManager settingsManager = this.e;
        int i3 = i2 == 2 ? settingsManager.x().b : i2;
        SparseArray sparseArray = this.a;
        if (i3 != 0) {
            if (i3 == 1) {
                sparseArray = this.b;
            } else if (i3 != 2 && i3 == 3) {
                sparseArray = this.c;
            }
        }
        bcd bcdVar = (bcd) sparseArray.get(i);
        if (bcdVar != null) {
            return bcdVar;
        }
        if (i2 == 2) {
            i2 = settingsManager.x().b;
        }
        if (i2 == 0) {
            pathI = i41.I(i);
        } else if (i2 != 1) {
            pathI = (i2 == 2 || i2 != 3) ? i41.I(i) : i41.H(i);
        } else {
            float f = i / 2.0f;
            Path path = new Path();
            path.addCircle(f, f, f, Path.Direction.CW);
            pathI = path;
        }
        bcd bcdVar2 = new bcd(this.d.getResources(), pathI, i);
        sparseArray.put(i, bcdVar2);
        return bcdVar2;
    }
}
