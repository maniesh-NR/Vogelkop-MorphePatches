package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Shader;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import androidx.core.content.res.ComplexColorCompat;
import androidx.fragment.app.a;
import androidx.fragment.app.w;
import com.leanplum.internal.Constants;
import com.leanplum.utils.SizeUtil;
import com.opera.android.OperaApplication;
import com.opera.android.autofill.PasswordManager;
import com.opera.android.settings.SettingsManager;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import okhttp3.internal._HeadersCommonKt;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public abstract class xih {
    public static final prb a(kvh kvhVar) {
        prb prbVar = new prb();
        prb prbVar2 = new prb();
        prbVar2.r("uri", kvhVar.a.h);
        prbVar2.r("verb", kvhVar.b);
        prbVar.o("firstline", prbVar2);
        e9a e9aVar = kvhVar.c;
        if (e9aVar.size() > 0) {
            wpb wpbVar = new wpb();
            Iterator itCommonIterator = _HeadersCommonKt.commonIterator(e9aVar);
            while (itCommonIterator.hasNext()) {
                Pair pair = (Pair) itCommonIterator.next();
                prb prbVar3 = new prb();
                prbVar3.r(Constants.Params.NAME, (String) pair.a);
                prbVar3.r(Constants.Params.VALUE, (String) pair.b);
                wpbVar.o(prbVar3);
            }
            prbVar.o("headers", wpbVar);
        }
        rvh rvhVar = kvhVar.d;
        if (rvhVar != null) {
            prbVar.r("body", Base64.encodeToString(rvhVar.toString().getBytes(Charsets.UTF_8), 0));
        }
        return prbVar;
    }

    public static boolean b(String str) {
        if (str == null || !str.startsWith("omid-native")) {
            return false;
        }
        try {
            Uri uri = Uri.parse(str);
            if (!"omid-native".equals(uri.getScheme())) {
                return false;
            }
            n1h.a(uri);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static final byte[] c(byte[] bArr, byte[] bArr2) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
        messageDigest.update(new byte[]{0, 0, 0, 16});
        messageDigest.update(bArr);
        messageDigest.update(bArr2);
        byte[] bArrDigest = messageDigest.digest();
        if (bArrDigest.length < 4) {
            return null;
        }
        return new byte[]{0, bArrDigest[0], bArrDigest[1], bArrDigest[2], bArrDigest[3]};
    }

    public static final String d(Number number, Number number2) {
        return "Random range is empty: [" + number + ", " + number2 + ").";
    }

    public static final void e(Long l, long j, apa apaVar) {
        if (l == null || l.longValue() < 0 || Intrinsics.a(apaVar, apa.g) || l.longValue() == j) {
            return;
        }
        throw new IllegalStateException(("Content-Length mismatch: expected " + l.longValue() + " bytes, but received " + j + " bytes").toString());
    }

    public static final u5i f(Context context, Class cls, String str) {
        if (StringsKt.N(str)) {
            qp2.o("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
            return null;
        }
        if (!str.equals(":memory:")) {
            return new u5i(context, cls, str);
        }
        qp2.o("Cannot build a database with the special name ':memory:'. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
        return null;
    }

    public static final List g(rpb rpbVar, String str) {
        List q0iVar;
        if (str == null) {
            return l08.a;
        }
        try {
            p0i p0iVar = t0i.b;
            rpbVar.getClass();
            q0iVar = (List) rpbVar.a(str, new k72(rdk.Companion.serializer(), (byte) 0));
        } catch (Throwable th) {
            p0i p0iVar2 = t0i.b;
            q0iVar = new q0i(th);
        }
        Throwable thD = t0i.d(q0iVar);
        if (thD != null) {
            hzc hzcVarC = hzc.c.c("StoredAmount");
            String str2 = hzcVarC.b;
            eaj eajVar = eaj.d;
            if (hzcVarC.a.a.compareTo(eajVar) <= 0) {
                hzcVarC.b(eajVar, str2, "Failed to parse stored amounts: ".concat(str), thD);
            }
        }
        if (q0iVar instanceof q0i) {
            q0iVar = null;
        }
        List list = q0iVar;
        if (list == null) {
            list = l08.a;
        }
        ArrayList arrayList = new ArrayList();
        for (rdk rdkVar : (Iterable) list) {
            psp pspVar = l01.d;
            String str3 = rdkVar.a;
            pspVar.getClass();
            l01 l01VarB = psp.b(str3);
            n01 n01Var = l01VarB == null ? null : new n01(l01VarB, rdkVar.b);
            if (n01Var != null) {
                arrayList.add(n01Var);
            }
        }
        return arrayList;
    }

    public static void h(int i, zwk zwkVar, SettingsManager settingsManager) {
        zwkVar.getClass();
        Set<ne6> set = zwk.b().a;
        for (ne6 ne6Var : set) {
            if (ne6Var.a == i) {
                set.remove(ne6Var);
                zwkVar.k(set);
                settingsManager.getClass();
                settingsManager.V(0, SettingsManager.B(ne6Var));
                return;
            }
        }
    }

    public static final String i(List list, rpb rpbVar) {
        if (list.isEmpty()) {
            return null;
        }
        List<n01> list2 = list;
        ArrayList arrayList = new ArrayList(k95.o(list2, 10));
        for (n01 n01Var : list2) {
            arrayList.add(new rdk(n01Var.a.c, n01Var.b));
        }
        rpbVar.getClass();
        return rpbVar.b(arrayList, new k72(rdk.Companion.serializer(), (byte) 0));
    }

    public static int j(int i, Context context, int i2) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId != 0 ? i : i2;
    }

    public static ColorStateList k(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "tint") != null) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(1, typedValue);
            int i = typedValue.type;
            if (i != 2) {
                if (i >= 28 && i <= 31) {
                    return ColorStateList.valueOf(typedValue.data);
                }
                Resources resources = typedArray.getResources();
                int resourceId = typedArray.getResourceId(1, 0);
                ThreadLocal threadLocal = ya5.a;
                try {
                    return ya5.a(resources, resources.getXml(resourceId), theme);
                } catch (Exception unused) {
                    return null;
                }
            }
            bxl.l(typedValue, "Failed to resolve attribute at index 1: ");
        }
        return null;
    }

    public static ComplexColorCompat l(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i) {
        ComplexColorCompat complexColorCompatA;
        if (n(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i2 = typedValue.type;
            if (i2 >= 28 && i2 <= 31) {
                return new ComplexColorCompat((Shader) null, (ColorStateList) null, typedValue.data);
            }
            try {
                complexColorCompatA = ComplexColorCompat.a(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
            } catch (Exception unused) {
                complexColorCompatA = null;
            }
            if (complexColorCompatA != null) {
                return complexColorCompatA;
            }
        }
        return new ComplexColorCompat((Shader) null, (ColorStateList) null, 0);
    }

    public static String m(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (n(xmlPullParser, str)) {
            return typedArray.getString(i);
        }
        return null;
    }

    public static boolean n(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    public static boolean o(View view) {
        if (view.getVisibility() != 0) {
            return false;
        }
        Object parent = view.getParent();
        if (parent instanceof View) {
            return o((View) parent);
        }
        return true;
    }

    public static TypedArray p(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    public static void q(db dbVar, zwk zwkVar, SettingsManager settingsManager) {
        if (zwk.h() || dbVar.b() == jh0.d) {
            wyk wykVarB = zwk.b();
            Set set = wykVarB.a;
            for (ne6 ne6Var : wykVarB.b) {
                if (ne6Var.a == 3) {
                    if (settingsManager.a.getInt(SettingsManager.B(ne6Var), -1) < 0 || settingsManager.i(SettingsManager.B(ne6Var))) {
                        set.add(ne6Var);
                        zwkVar.k(set);
                        settingsManager.V(1, SettingsManager.B(ne6Var));
                        return;
                    }
                    return;
                }
            }
        }
    }

    public static String r(int i, String str) {
        return (TextUtils.isEmpty(str) || str.length() < i) ? str : str.substring(0, i).concat("…");
    }

    public static void s(TextView textView, int i) {
        jpo.l(i);
        if (i != textView.getPaint().getFontMetricsInt(null)) {
            textView.setLineSpacing(i - r0, 1.0f);
        }
    }

    public static void t(w wVar, boolean z, tvh tvhVar) {
        mwk mwkVar = new mwk();
        Bundle bundle = new Bundle();
        bundle.putBoolean("SHOW_EDIT_PROFILE_ON_SUCCESS", z);
        if (tvhVar != null) {
            bundle.putParcelable("FALLBACK_REQUEST_BUILDER", tvhVar);
        }
        mwkVar.setArguments(bundle);
        wVar.getClass();
        a aVar = new a(wVar);
        aVar.e(0, mwkVar, "sync-auth", 1);
        aVar.h();
    }

    public static void u(w wVar) {
        t(wVar, true, null);
    }

    public static void v(w wVar, db dbVar, String str, mni mniVar) {
        cw7 cw7Var = new cw7(dbVar, mniVar);
        if (str != null) {
            Bundle bundle = new Bundle();
            bundle.putString("ARGUMENT_HIGHLIGHT_SECTION", str);
            cw7Var.setArguments(bundle);
        }
        a aVarF = u35.f(wVar, wVar);
        aVarF.e(0, cw7Var, "sync-auth-edit", 1);
        aVarF.h();
    }

    public static void w(w wVar, db dbVar, fv2 fv2Var, boolean z) {
        d49 d49Var = new d49(dbVar, fv2Var);
        Bundle bundle = new Bundle();
        bundle.putBoolean("SHOW_EDIT_PROFILE_ON_SUCCESS", z);
        d49Var.setArguments(bundle);
        wVar.getClass();
        a aVar = new a(wVar);
        aVar.e(0, d49Var, "sync-auth-finish-setup", 1);
        aVar.h();
    }

    public static void x(z77 z77Var, db dbVar, zwk zwkVar, Runnable runnable, l31 l31Var) {
        zwkVar.getClass();
        t48 t48Var = (zwk.i() && zwk.h()) ? new t48(new w48(), runnable, (byte) 0) : new t48(new f0i(dbVar, new PasswordManager(), l31Var), runnable, (byte) 1);
        z77Var.getClass();
        z77Var.b(t48Var, ijm.b);
    }

    public static void y(Context context, zwk zwkVar, Runnable runnable, l31 l31Var) {
        z77 z77VarU = sfe.U(context);
        String[] strArr = OperaApplication.K;
        x(z77VarU, ((OperaApplication) context.getApplicationContext()).b(), zwkVar, runnable, l31Var);
    }

    public static final Integer z(lon lonVar) {
        switch (lonVar.ordinal()) {
            case 0:
                return 2131951676;
            case 1:
                return 2131951634;
            case 2:
                return 2131951635;
            case 3:
                return 2131951642;
            case 4:
                return 2131951650;
            case 5:
                return 2131951644;
            case 6:
                return 2131951645;
            case 7:
                return 2131951646;
            case 8:
                return 2131951648;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                return 2131951647;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                return 2131951651;
            case 11:
                return 2131951656;
            case 12:
                return 2131951657;
            case 13:
                return 2131951676;
            case 14:
                return 2131951634;
            case 15:
                return 2131951663;
            case 16:
                return 2131951664;
            case 17:
                return 2131951636;
            case SizeUtil.textSize0_1 /* 18 */:
                return 2131951637;
            case 19:
                return 2131951665;
            case SizeUtil.textSize0 /* 20 */:
                return 2131951658;
            case 21:
                return 2131951638;
            case SizeUtil.textSize1 /* 22 */:
                return 2131951639;
            case 23:
                return 2131951640;
            case SizeUtil.textSize2 /* 24 */:
                return 2131951641;
            case 25:
                return null;
            case 26:
                return 2131951662;
            case 27:
                return 2131951663;
            case 28:
                return 2131951664;
            case 29:
                return 2131951636;
            case 30:
                return 2131951637;
            case 31:
                return 2131951665;
            case 32:
                return 2131951658;
            case 33:
                return 2131951640;
            case 34:
                return 2131951641;
            case 35:
                return 2131951671;
            case 36:
                return 2131951668;
            case 37:
                return 2131951670;
            case 38:
                return 2131951671;
            case 39:
                return 2131951672;
            case 40:
                return 2131951681;
            case 41:
                return 2131951688;
            default:
                h9o.p();
                return null;
        }
    }
}
