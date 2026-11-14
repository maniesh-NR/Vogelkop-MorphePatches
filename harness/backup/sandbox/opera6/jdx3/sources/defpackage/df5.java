package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import com.leanplum.internal.ResourceQualifiers;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class df5 implements er9 {
    public final /* synthetic */ byte a;

    public final Object m(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i;
        int i2;
        boolean z;
        byte b = this.a;
        int i3 = ResourceQualifiers.Qualifier.AnonymousClass5.SCREENLAYOUT_LAYOUTDIR_RTL;
        switch (b) {
            case 0:
                xfl xflVar = (xfl) obj;
                lfl lflVar = (lfl) obj2;
                Function0 function0 = (Function0) obj3;
                vt9 vt9Var = (ih5) obj4;
                int iIntValue = ((Integer) obj5).intValue();
                if ((iIntValue & 6) == 0) {
                    i = ((iIntValue & 8) == 0 ? vt9Var.f(xflVar) : vt9Var.h(xflVar) ? 4 : 2) | iIntValue;
                } else {
                    i = iIntValue;
                }
                if ((iIntValue & 48) == 0) {
                    i |= (iIntValue & 64) == 0 ? vt9Var.f(lflVar) : vt9Var.h(lflVar) ? 32 : 16;
                }
                if ((iIntValue & 384) == 0) {
                    if (vt9Var.h(function0)) {
                        i3 = 256;
                    }
                    i |= i3;
                }
                vt9 vt9Var2 = vt9Var;
                if (vt9Var2.N(i & 1, (i & 1171) != 1170)) {
                    sw6.c(xflVar, lflVar, function0, vt9Var2, i & 1022);
                } else {
                    vt9Var2.Q();
                }
                return Unit.a;
            case 1:
                xfl xflVar2 = (xfl) obj;
                lfl lflVar2 = (lfl) obj2;
                Function0 function02 = (Function0) obj3;
                vt9 vt9Var3 = (ih5) obj4;
                int iIntValue2 = ((Integer) obj5).intValue();
                if ((iIntValue2 & 6) == 0) {
                    i2 = ((iIntValue2 & 8) == 0 ? vt9Var3.f(xflVar2) : vt9Var3.h(xflVar2) ? 4 : 2) | iIntValue2;
                } else {
                    i2 = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i2 |= (iIntValue2 & 64) == 0 ? vt9Var3.f(lflVar2) : vt9Var3.h(lflVar2) ? 32 : 16;
                }
                if ((iIntValue2 & 384) == 0) {
                    if (vt9Var3.h(function02)) {
                        i3 = 256;
                    }
                    i2 |= i3;
                }
                vt9 vt9Var4 = vt9Var3;
                if (vt9Var4.N(i2 & 1, (i2 & 1171) != 1170)) {
                    sw6.c(xflVar2, lflVar2, function02, vt9Var4, i2 & 1022);
                } else {
                    vt9Var4.Q();
                }
                return Unit.a;
            case 2:
                tpc tpcVar = (tpc) obj;
                String str = (String) obj3;
                v0f v0fVar = (v0f) obj4;
                v0f v0fVar2 = (v0f) obj5;
                int iOrdinal = ((cse) obj2).ordinal();
                if (iOrdinal == 0) {
                    z = true;
                } else {
                    if (iOrdinal != 1 && iOrdinal == 2) {
                        return null;
                    }
                    z = false;
                }
                v0f v0fVar3 = v0f.c;
                return new moc(tpcVar, str, z, v0fVar == v0fVar3, v0fVar2 == v0fVar3, true);
            default:
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                xjl xjlVar = (xjl) obj5;
                String string = ((CharSequence) obj4).subSequence(xjl.f(xjlVar.a), xjl.e(xjlVar.a)).toString();
                Intent intentPutExtra = new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain").putExtra("android.intent.extra.PROCESS_TEXT_READONLY", zBooleanValue);
                ActivityInfo activityInfo = ((ResolveInfo) obj2).activityInfo;
                Intent className = intentPutExtra.setClassName(activityInfo.packageName, activityInfo.name);
                className.putExtra("android.intent.extra.PROCESS_TEXT", string);
                ((Context) obj).startActivity(className);
                return Unit.a;
        }
    }
}
