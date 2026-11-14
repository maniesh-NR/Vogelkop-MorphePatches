package defpackage;

import android.graphics.Rect;
import android.os.Handler;
import android.os.HandlerThread;
import com.leanplum.utils.SizeUtil;
import java.io.File;
import java.lang.annotation.Annotation;
import java.util.BitSet;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.chromium.base.PathUtils;

/* loaded from: classes.dex */
public final /* synthetic */ class thk implements Function0 {
    public final /* synthetic */ byte a;

    public /* synthetic */ thk(byte b) {
        this.a = b;
    }

    public final Object invoke() throws ClassNotFoundException {
        String str = "";
        switch (this.a) {
            case 0:
                return "";
            case 1:
                return new t7a(xhk.a, new k72(yik.a, (byte) 0), (byte) 1);
            case 2:
                return yne.b;
            case 3:
                return new gh7(0.0f);
            case 4:
                return Unit.a;
            case 5:
                return new Rect();
            case 6:
                try {
                    Class<?> cls = Class.forName("android.os.SystemProperties");
                    str = (String) cls.getMethod("get", String.class, String.class).invoke(cls, "ro.build.backported_fixes.alias_bitset.long_list", "");
                } catch (Exception unused) {
                }
                ehc ehcVarB = a.b();
                Iterator it = StringsKt.X(str, new char[]{','}).iterator();
                while (it.hasNext()) {
                    try {
                        ehcVarB.add(Long.valueOf(Long.parseLong((String) it.next())));
                    } catch (NumberFormatException unused2) {
                    }
                }
                BitSet bitSetValueOf = BitSet.valueOf(CollectionsKt.l0(a.a(ehcVarB)));
                int size = bitSetValueOf.size();
                if (size == 0) {
                    return v08.a;
                }
                p4j p4jVar = new p4j(new u9d(size));
                for (int iNextSetBit = 0; iNextSetBit >= 0; iNextSetBit = bitSetValueOf.nextSetBit(iNextSetBit + 1)) {
                    if (bitSetValueOf.get(iNextSetBit)) {
                        p4jVar.add(Integer.valueOf(iNextSetBit));
                    }
                    if (iNextSetBit == Integer.MAX_VALUE) {
                        return z4j.a(p4jVar);
                    }
                }
                return z4j.a(p4jVar);
            case 7:
                return new k72(j4l.a, (byte) 0);
            case 8:
                return new File(PathUtils.a(0), "tab_groups");
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                return Unit.a;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                File file = new File(PathUtils.a(0), "tab_screenshots");
                if (!file.exists()) {
                    file.mkdirs();
                }
                return file;
            case 11:
                return Unit.a;
            case 12:
            case 13:
                return null;
            case 14:
                return cbm.a;
            case 15:
                return new ybb(0L);
            case 16:
                return new ybb(0L);
            case 17:
                return tw6.a;
            case SizeUtil.textSize0_1 /* 18 */:
                return Unit.a;
            case 19:
                return Unit.a;
            case SizeUtil.textSize0 /* 20 */:
                SerialDescriptor[] serialDescriptorArr = new SerialDescriptor[0];
                if (StringsKt.N("kotlinx.datetime.TimeBased")) {
                    qp2.o("Blank serial names are prohibited");
                    return null;
                }
                t15 t15Var = new t15("kotlinx.datetime.TimeBased");
                t15Var.a("nanoseconds", h1d.b, l08.a);
                return new d2j("kotlinx.datetime.TimeBased", xik.b, t15Var.c.size(), e82.B(serialDescriptorArr), t15Var);
            case 21:
                return Unit.a;
            case SizeUtil.textSize1 /* 22 */:
                return new i58("com.opera.android.ntp.EventType", ld8.values());
            case 23:
                return new k72(xhk.a, (byte) 0);
            case SizeUtil.textSize2 /* 24 */:
                return new i58("com.opera.celopay.model.blockchain.Net", nle.values());
            case 25:
                return new ong(uqh.a(rzl.class), new Annotation[0]);
            case 26:
                return new i58("com.opera.celopay.model.money.Currency.Token", h46.values());
            case 27:
                HandlerThread handlerThread = new HandlerThread("font-downloader", 10);
                handlerThread.start();
                return new Handler(handlerThread.getLooper());
            case 28:
                return null;
            default:
                ikl iklVar = bbm.d;
                ikl iklVar2 = bbm.e;
                ikl iklVar3 = bbm.f;
                ikl iklVar4 = bbm.g;
                ikl iklVar5 = bbm.h;
                ikl iklVar6 = bbm.i;
                ikl iklVar7 = bbm.m;
                ikl iklVar8 = bbm.n;
                ikl iklVar9 = bbm.o;
                ikl iklVar10 = bbm.a;
                ikl iklVar11 = bbm.b;
                ikl iklVar12 = bbm.c;
                ikl iklVar13 = bbm.j;
                ikl iklVar14 = bbm.k;
                ikl iklVar15 = bbm.l;
                return new wam(iklVar, iklVar2, iklVar3, iklVar4, iklVar5, iklVar6, iklVar7, iklVar8, iklVar9, iklVar10, iklVar11, iklVar12, iklVar13, iklVar14, iklVar15, iklVar, iklVar2, iklVar3, iklVar4, iklVar5, iklVar6, iklVar7, iklVar8, iklVar9, iklVar10, iklVar11, iklVar12, iklVar13, iklVar14, iklVar15);
        }
    }
}
