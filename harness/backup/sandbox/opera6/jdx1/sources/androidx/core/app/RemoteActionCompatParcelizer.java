package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import defpackage.e2n;
import defpackage.f2n;
import defpackage.g2n;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(e2n e2nVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        g2n g2nVarH = remoteActionCompat.a;
        boolean z = true;
        if (e2nVar.e(1)) {
            g2nVarH = e2nVar.h();
        }
        remoteActionCompat.a = (IconCompat) g2nVarH;
        CharSequence charSequence = remoteActionCompat.b;
        if (e2nVar.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((f2n) e2nVar).e);
        }
        remoteActionCompat.b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.c;
        if (e2nVar.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((f2n) e2nVar).e);
        }
        remoteActionCompat.c = charSequence2;
        remoteActionCompat.d = (PendingIntent) e2nVar.g(remoteActionCompat.d, 4);
        boolean z2 = remoteActionCompat.e;
        if (e2nVar.e(5)) {
            z2 = ((f2n) e2nVar).e.readInt() != 0;
        }
        remoteActionCompat.e = z2;
        boolean z3 = remoteActionCompat.f;
        if (!e2nVar.e(6)) {
            z = z3;
        } else if (((f2n) e2nVar).e.readInt() == 0) {
            z = false;
        }
        remoteActionCompat.f = z;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, e2n e2nVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        e2nVar.getClass();
        IconCompat iconCompat = remoteActionCompat.a;
        e2nVar.i(1);
        e2nVar.l(iconCompat);
        CharSequence charSequence = remoteActionCompat.b;
        e2nVar.i(2);
        Parcel parcel = ((f2n) e2nVar).e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.c;
        e2nVar.i(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        e2nVar.k(remoteActionCompat.d, 4);
        boolean z = remoteActionCompat.e;
        e2nVar.i(5);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = remoteActionCompat.f;
        e2nVar.i(6);
        parcel.writeInt(z2 ? 1 : 0);
    }
}
