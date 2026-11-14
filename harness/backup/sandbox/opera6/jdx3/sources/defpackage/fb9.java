package defpackage;

import android.content.ContentResolver;
import android.net.Uri;
import com.leanplum.utils.SizeUtil;
import com.opera.android.OperaApplication;
import com.opera.android.startpage.livescore.LiveScoreAudioCommentaryView;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class fb9 extends kuk implements Function2 {
    public final /* synthetic */ byte t;
    public /* synthetic */ Object u;
    public final /* synthetic */ Object v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fb9(byte b, mt5 mt5Var, Object obj) {
        super(2, mt5Var);
        this.t = b;
        this.v = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fb9(Object obj, Object obj2, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.u = obj;
        this.v = obj2;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.t;
        Object obj2 = this.v;
        switch (b) {
            case 0:
                return new fb9((ekc) this.u, (f7f) obj2, mt5Var, (byte) 0);
            case 1:
                return new fb9((wi9) this.u, (hne) obj2, mt5Var, (byte) 1);
            case 2:
                return new fb9((eqa) this.u, (String) obj2, mt5Var, (byte) 2);
            case 3:
                return new fb9((z8b) this.u, (Uri) obj2, mt5Var, (byte) 3);
            case 4:
                return new fb9((ContentResolver) this.u, (tza) obj2, mt5Var, (byte) 4);
            case 5:
                fb9 fb9Var = new fb9((byte) 5, mt5Var, (Function0) obj2);
                fb9Var.u = obj;
                return fb9Var;
            case 6:
                fb9 fb9Var2 = new fb9((byte) 6, mt5Var, (Long) obj2);
                fb9Var2.u = obj;
                return fb9Var2;
            case 7:
                fb9 fb9Var3 = new fb9((byte) 7, mt5Var, (u7c) obj2);
                fb9Var3.u = obj;
                return fb9Var3;
            case 8:
                fb9 fb9Var4 = new fb9((byte) 8, mt5Var, (ddc) obj2);
                fb9Var4.u = obj;
                return fb9Var4;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                fb9 fb9Var5 = new fb9((byte) 9, mt5Var, (tkc) obj2);
                fb9Var5.u = obj;
                return fb9Var5;
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                fb9 fb9Var6 = new fb9((byte) 10, mt5Var, (LiveScoreAudioCommentaryView) obj2);
                fb9Var6.u = obj;
                return fb9Var6;
            case 11:
                fb9 fb9Var7 = new fb9((byte) 11, mt5Var, (xh7) obj2);
                fb9Var7.u = obj;
                return fb9Var7;
            case 12:
                fb9 fb9Var8 = new fb9((byte) 12, mt5Var, (aqc) obj2);
                fb9Var8.u = obj;
                return fb9Var8;
            case 13:
                return new fb9((OperaApplication) this.u, (jqc) obj2, mt5Var, (byte) 13);
            case 14:
                return new fb9((OperaApplication) this.u, (lqc) obj2, mt5Var, (byte) 14);
            case 15:
                return new fb9((OperaApplication) this.u, (kqc) obj2, mt5Var, (byte) 15);
            case 16:
                return new fb9((t3d) this.u, (List) obj2, mt5Var, (byte) 16);
            case 17:
                fb9 fb9Var9 = new fb9((byte) 17, mt5Var, (r6d) obj2);
                fb9Var9.u = obj;
                return fb9Var9;
            case SizeUtil.textSize0_1 /* 18 */:
                return new fb9((xf2) this.u, (l94) obj2, mt5Var, (byte) 18);
            case 19:
                fb9 fb9Var10 = new fb9((byte) 19, mt5Var, (d3h) obj2);
                fb9Var10.u = obj;
                return fb9Var10;
            case SizeUtil.textSize0 /* 20 */:
                fb9 fb9Var11 = new fb9((byte) 20, mt5Var, (x79) obj2);
                fb9Var11.u = obj;
                return fb9Var11;
            case 21:
                return new fb9((n9h) this.u, (String) obj2, mt5Var, (byte) 21);
            case SizeUtil.textSize1 /* 22 */:
                return new fb9((xri) this.u, (ych) obj2, mt5Var, (byte) 22);
            case 23:
                return new fb9((kt5) this.u, (orb) obj2, mt5Var, (byte) 23);
            case SizeUtil.textSize2 /* 24 */:
                return new fb9((kt5) this.u, (String) obj2, mt5Var, (byte) 24);
            case 25:
                fb9 fb9Var12 = new fb9((byte) 25, mt5Var, (h3i) obj2);
                fb9Var12.u = obj;
                return fb9Var12;
            case 26:
                return new fb9((x3i) this.u, (o4i) obj2, mt5Var, (byte) 26);
            case 27:
                return new fb9((x3i) this.u, (o0f) obj2, mt5Var, (byte) 27);
            case 28:
                fb9 fb9Var13 = new fb9((byte) 28, mt5Var, (Function2) obj2);
                fb9Var13.u = obj;
                return fb9Var13;
            default:
                return new fb9((xbf) this.u, (e74) obj2, mt5Var, (byte) 29);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.t) {
        }
        return create((nx5) obj, (mt5) obj2).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1976
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fb9.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
