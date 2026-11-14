package defpackage;

import android.net.Uri;
import com.leanplum.utils.SizeUtil;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.chromium.url.GURL;
import org.web3j.abi.TypeEncoder;
import org.web3j.abi.TypeReference;
import org.web3j.abi.Utils;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.Utf8String;

/* loaded from: classes.dex */
public final /* synthetic */ class mn implements Function {
    public final /* synthetic */ byte a;

    public /* synthetic */ mn(byte b) {
        this.a = b;
    }

    public /* synthetic */ mn(Function1 function1, byte b) {
        this.a = b;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        int i = 0;
        switch (this.a) {
            case 0:
                String[] strArr = wqm.a;
                return Uri.parse((String) obj).buildUpon().clearQuery().build().toString();
            case 1:
                return ((qhc) obj).a;
            case 2:
                return ((qhc) ((guh) obj).a).a;
            case 3:
                return jg7.a((re7) obj);
            case 4:
                return Utils.getTypeName((TypeReference) obj);
            case 5:
                String str = (String) obj;
                gd7 gd7Var = new gd7();
                gd7Var.b = str;
                if (str != null) {
                    return new egh(gd7Var);
                }
                qp2.o("Product id must be provided.");
                return null;
            case 6:
                h2h h2hVar = (h2h) obj;
                String str2 = h2hVar.d;
                ArrayList arrayList = h2hVar.h;
                if (!Intrinsics.a(str2, "subs") || arrayList == null || arrayList.isEmpty()) {
                    return null;
                }
                String str3 = h2hVar.c;
                int i2 = 10;
                ArrayList arrayList2 = new ArrayList(k95.o(arrayList, 10));
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj2 = arrayList.get(i3);
                    i3++;
                    g2h g2hVar = (g2h) obj2;
                    String str4 = g2hVar.a;
                    String str5 = g2hVar.b;
                    String str6 = g2hVar.c;
                    ArrayList arrayList3 = g2hVar.d.a;
                    ArrayList arrayList4 = new ArrayList(k95.o(arrayList3, i2));
                    int size2 = arrayList3.size();
                    int i4 = i;
                    while (i4 < size2) {
                        Object obj3 = arrayList3.get(i4);
                        i4++;
                        f2h f2hVar = (f2h) obj3;
                        arrayList4.add(new pxg(f2hVar.a, f2hVar.c, f2hVar.b, f2hVar.d, f2hVar.e, f2hVar.f));
                        arrayList = arrayList;
                    }
                    arrayList2.add(new tlk(str4, str5, str6, arrayList4));
                    i = 0;
                    i2 = 10;
                }
                return new nsh(h2hVar, str3, arrayList2);
            case 7:
                return ((Type) obj).getTypeAsString();
            case 8:
                return ((a1c) obj).b;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                int iOrdinal = ((apc) obj).ordinal();
                if (iOrdinal == 0) {
                    return gue.FOOTBALL;
                }
                if (iOrdinal == 1) {
                    return gue.BASKETBALL;
                }
                throw new RuntimeException(null, null);
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                return new ArrayList();
            case 11:
                return ((GURL) obj).g();
            case 12:
                return new Utf8String((String) obj);
            case 13:
                return ((Utf8String) obj).getValue();
            case 14:
                return new ArrayList();
            case 15:
                return new neg();
            case 16:
                return new neg();
            case 17:
                return ((uah) obj).a;
            case SizeUtil.textSize0_1 /* 18 */:
                return Integer.valueOf(((enh) obj).d);
            case 19:
                return Integer.valueOf(((ozj) obj).b());
            case SizeUtil.textSize0 /* 20 */:
                return TypeEncoder.encode((Type) obj);
            case 21:
                return Utils.a((TypeReference) obj);
            case SizeUtil.textSize1 /* 22 */:
                return Utils.g((Field) obj);
            case 23:
                return ((List) obj).stream();
            case SizeUtil.textSize2 /* 24 */:
                return ((aln) obj).getId();
            case 25:
                return ((String) obj).replace("NETWORK_", "");
            case 26:
                kln klnVar = (kln) obj;
                String str7 = klnVar.a;
                String str8 = klnVar.d;
                return str8 == null ? str7.startsWith("FILE_user_wallpaper_") ? str7.substring(20) : "" : str8;
            case 27:
                return new AtomicInteger(0);
            default:
                return new AtomicInteger(0);
        }
    }
}
