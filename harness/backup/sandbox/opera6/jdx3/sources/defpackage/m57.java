package defpackage;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
import com.leanplum.utils.SizeUtil;
import com.opera.hype.image.editor.EditImage;
import java.net.InetAddress;
import java.util.Iterator;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final /* synthetic */ class m57 implements Function1 {
    public final /* synthetic */ byte a;

    public /* synthetic */ m57(byte b) {
        this.a = b;
    }

    public final Object invoke(Object obj) {
        String upperCase;
        z = false;
        boolean z = false;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        switch (this.a) {
            case 0:
                Integer num = (Integer) obj;
                if (num.intValue() > 0) {
                    return num;
                }
                qp2.o("Timeout must be greater than zero.");
                return null;
            case 1:
                String string = StringsKt.l0((String) obj).toString();
                if (StringsKt.N(string)) {
                    return null;
                }
                return string;
            case 2:
                i06 i06Var = ft8.a;
                String str = ((g57) obj).y;
                i06Var.getClass();
                if (str == null) {
                    return null;
                }
                Iterator it = ft8.d.iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object next = it.next();
                        if (Intrinsics.a(((ft8) next).name(), str)) {
                            obj2 = next;
                        }
                    }
                }
                return (ft8) obj2;
            case 3:
                int i = ((g57) obj).j;
                Integer numValueOf = i > 0 ? Integer.valueOf(i) : null;
                return Integer.valueOf(numValueOf != null ? numValueOf.intValue() : 60);
            case 4:
                cpj cpjVar = nrk.a;
                String str2 = ((g57) obj).E;
                cpjVar.getClass();
                if (str2 == null) {
                    return null;
                }
                Iterator it2 = nrk.d.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        Object next2 = it2.next();
                        if (Intrinsics.a(((nrk) next2).name(), str2)) {
                            obj4 = next2;
                        }
                    }
                }
                return (nrk) obj4;
            case 5:
                String str3 = (String) obj;
                if (StringsKt.N(str3)) {
                    return null;
                }
                int i2 = ny5.a;
                if (str3.length() == 2) {
                    for (int i3 = 0; i3 < str3.length(); i3++) {
                        char cCharAt = str3.charAt(i3);
                        int i4 = wym.a;
                        if (('a' > cCharAt || cCharAt >= '{') && ('A' > cCharAt || cCharAt >= '[')) {
                            upperCase = null;
                        }
                    }
                    upperCase = str3.toUpperCase(Locale.ROOT);
                } else {
                    upperCase = null;
                }
                if (upperCase != null) {
                    return upperCase;
                }
                qp2.o("Invalid country code: ".concat(str3));
                return null;
            case 6:
                return Boolean.valueOf(((g57) obj).k);
            case 7:
                r16 r16Var = t97.a;
                String str4 = ((g57) obj).m;
                r16Var.getClass();
                Iterator it3 = t97.d.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        Object next3 = it3.next();
                        if (Intrinsics.a(((t97) next3).name(), str4)) {
                            obj3 = next3;
                        }
                    }
                }
                t97 t97Var = (t97) obj3;
                return t97Var == null ? t97.b : t97Var;
            case 8:
                return Boolean.valueOf(na2.i(obj));
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                return ((InetAddress) obj).getHostAddress();
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                ((k45) obj).a.g.f(mpa.f, new y40(3, (mt5) null));
                return Unit.a;
            case 11:
                ((Boolean) obj).getClass();
                return Unit.a;
            case 12:
                ((Float) obj).getClass();
                return Unit.a;
            case 13:
                ((Float) obj).getClass();
                return Unit.a;
            case 14:
                return Boolean.TRUE;
            case 15:
                bfl bflVar = (bfl) obj;
                xtb[] xtbVarArr = EditImage.s;
                if (bflVar.b() && !bflVar.a()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 16:
                ViewGroup viewGroup = (ViewGroup) obj;
                xtb[] xtbVarArr2 = EditImage.s;
                LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
                viewGroup.setLayoutTransition(null);
                viewGroup.setLayoutTransition(layoutTransition);
                return Unit.a;
            case 17:
                xtb[] xtbVarArr3 = EditImage.s;
                Object tag = ((View) obj).getTag(2131363169);
                if (tag instanceof bfl) {
                    return (bfl) tag;
                }
                return null;
            case SizeUtil.textSize0_1 /* 18 */:
                return ((bfl) obj).e;
            case 19:
                bfl bflVar2 = (bfl) obj;
                if (!bflVar2.b() || bflVar2.c()) {
                    return bflVar2.e;
                }
                return null;
            case SizeUtil.textSize0 /* 20 */:
                return ((bfl) obj).d.h;
            case 21:
                return ((bfl) obj).d.c;
            case SizeUtil.textSize1 /* 22 */:
                return (View) ((bfl) obj).d.i;
            case 23:
                return ((bfl) obj).d.d;
            case SizeUtil.textSize2 /* 24 */:
                return ((bfl) obj).d.f;
            case 25:
                return ((bfl) obj).d.g;
            case 26:
                return ((bfl) obj).d.j;
            case 27:
                return ((l0a) obj).c;
            case 28:
                return ((l0a) obj).b;
            default:
                return Unit.a;
        }
    }
}
