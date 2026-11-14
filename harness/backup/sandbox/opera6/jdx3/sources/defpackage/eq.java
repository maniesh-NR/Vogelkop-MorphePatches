package defpackage;

import com.leanplum.internal.ResourceQualifiers;
import com.leanplum.messagetemplates.MessageTemplateConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;

/* loaded from: classes.dex */
public final class eq {
    public static final eq c;
    public static final eq d;
    public static final /* synthetic */ eq e;
    public static final List f;
    public static final /* synthetic */ Set g;
    public final short a;
    public final short b;

    static {
        eq eqVar = new eq(320, 50);
        c = eqVar;
        eq eqVar2 = new eq(MessageTemplateConstants.Values.CENTER_POPUP_WIDTH, MessageTemplateConstants.Values.CENTER_POPUP_HEIGHT);
        d = eqVar2;
        eq eqVar3 = new eq(MessageTemplateConstants.Values.CENTER_POPUP_WIDTH, 50);
        eq eqVar4 = new eq(320, 100);
        eq eqVar5 = new eq(320, ResourceQualifiers.Qualifier.AnonymousClass14.DENSITY_XXHIGH);
        eq eqVar6 = new eq(468, 60);
        eq eqVar7 = new eq(728, 90);
        e = new eq(720, 1080);
        List listAsList = Arrays.asList(eqVar, eqVar2, eqVar3, eqVar4, eqVar5, eqVar6, eqVar7);
        f = listAsList;
        ArrayList arrayList = new ArrayList();
        for (Object obj : listAsList) {
            if (((eq) obj).b >= 250) {
                arrayList.add(obj);
            }
        }
        g = CollectionsKt.n0(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public eq(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eq)) {
            return false;
        }
        eq eqVar = (eq) obj;
        return this.a == eqVar.a && this.b == eqVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdSize(width=");
        sb.append((int) this.a);
        sb.append(", height=");
        return fki.s(sb, this.b, ')');
    }
}
