package defpackage;

import ads_mobile_sdk.av2;
import ads_mobile_sdk.dr2;
import ads_mobile_sdk.eq2;
import ads_mobile_sdk.i8;
import ads_mobile_sdk.ih1;
import ads_mobile_sdk.j71;
import ads_mobile_sdk.k71;
import ads_mobile_sdk.qr0;
import android.app.UiModeManager;
import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public abstract class ynh {
    public static boolean a;
    public static UiModeManager b;
    public static volatile String c;
    public static volatile String d;
    public static volatile String e;
    public static volatile String f;
    public static volatile String g;

    public static final xep a(xep xepVar, hp hpVar, av2 av2Var, String str, k71 k71Var, qr0 qr0Var) {
        Optional optionalOf = Optional.of(hpVar);
        k71Var.getClass();
        return (xep) ((xep) ((xep) ((xep) ((xep) ((xep) ((xep) ((xep) ((xep) ((xep) xepVar.a(hpVar)).a(av2Var)).a(new eq2())).a(new ih1())).a(new j71(k71Var.a, av2Var, optionalOf, str, false, k71Var.b, k71Var.c))).a(false)).a(new dr2())).b()).c(true)).a(new i8(qr0Var));
    }

    public static void b(lqj lqjVar, List list, fi5 fi5Var) {
        List list2 = list;
        if (list2.isEmpty()) {
            return;
        }
        int size = list2.size();
        for (int i = 0; i < size; i++) {
            int iC = lqjVar.c((qt9) list.get(i));
            int iM = lqjVar.M(lqjVar.q(iC), lqjVar.b);
            Object obj = iM < lqjVar.f(lqjVar.q(iC + 1), lqjVar.b) ? lqjVar.c[lqjVar.g(iM)] : hh5.a;
            znh znhVar = obj instanceof znh ? (znh) obj : null;
            if (znhVar != null) {
                znhVar.a = fi5Var;
            }
        }
    }

    public static String c() {
        return new Uri.Builder().scheme("https").authority(c + ".s.adx.opera.com").appendPath("osdk").appendPath("config").build().toString();
    }

    public static String d(int i, String str) {
        return str != null ? p3p.j(i, "[", "] ", str) : p3p.i(i, "[", "]");
    }

    public static final Object e(f0j f0jVar, p0j p0jVar) {
        Object objG = f0jVar.a.g(p0jVar);
        if (objG == null) {
            return null;
        }
        return objG;
    }

    public static MappedByteBuffer f(Context context, Uri uri) throws IOException {
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor;
        try {
            parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
        } catch (IOException unused) {
        }
        if (parcelFileDescriptorOpenFileDescriptor == null) {
            if (parcelFileDescriptorOpenFileDescriptor != null) {
                parcelFileDescriptorOpenFileDescriptor.close();
                return null;
            }
            return null;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
            try {
                FileChannel channel = fileInputStream.getChannel();
                MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                fileInputStream.close();
                parcelFileDescriptorOpenFileDescriptor.close();
                return map;
            } finally {
            }
        } finally {
        }
    }

    public static final void g(spa spaVar, String str, Object obj) {
        if (obj != null) {
            spaVar.a.j.i(str, obj.toString());
        }
    }

    public static void h(plk plkVar) {
        plk plkVar2 = (plk) plkVar.d;
        if (plkVar2 == null) {
            return;
        }
        ((nml) plkVar2.b).b((nml) plkVar.b);
        h((plk) plkVar.d);
    }

    public static udk i(shk shkVar) {
        return new udk(shkVar, l08.a);
    }

    public static wdk j(String str) {
        return new wdk(str, l08.a);
    }

    public static final void k(y5i y5iVar) {
        if (((AtomicBoolean) y5iVar.g.c).get()) {
            qp2.n("Database is closed");
        }
    }
}
