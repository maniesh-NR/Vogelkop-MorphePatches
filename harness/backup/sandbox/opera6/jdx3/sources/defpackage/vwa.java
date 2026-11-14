package defpackage;

import android.content.Context;
import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.leanplum.utils.SizeUtil;
import com.opera.hype.image.editor.EditImage;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class vwa extends kuk implements Function2 {
    public final /* synthetic */ byte t;
    public /* synthetic */ Object u;
    public final /* synthetic */ ywa v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vwa(ywa ywaVar, mt5 mt5Var, byte b) {
        super(2, mt5Var);
        this.t = b;
        this.v = ywaVar;
    }

    public final mt5 create(Object obj, mt5 mt5Var) {
        byte b = this.t;
        ywa ywaVar = this.v;
        switch (b) {
            case 0:
                vwa vwaVar = new vwa(ywaVar, mt5Var, (byte) 0);
                vwaVar.u = obj;
                return vwaVar;
            case 1:
                vwa vwaVar2 = new vwa(ywaVar, mt5Var, (byte) 1);
                vwaVar2.u = obj;
                return vwaVar2;
            case 2:
                vwa vwaVar3 = new vwa(ywaVar, mt5Var, (byte) 2);
                vwaVar3.u = obj;
                return vwaVar3;
            default:
                vwa vwaVar4 = new vwa(ywaVar, mt5Var, (byte) 3);
                vwaVar4.u = obj;
                return vwaVar4;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.t) {
            case 0:
                return create((List) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 1:
                return create((iea) obj, (mt5) obj2).invokeSuspend(Unit.a);
            case 2:
                return create((s5h) obj, (mt5) obj2).invokeSuspend(Unit.a);
            default:
                return create((nsl) obj, (mt5) obj2).invokeSuspend(Unit.a);
        }
    }

    public final Object invokeSuspend(Object obj) {
        lh3 lh3Var;
        at7 at7Var;
        byte b = this.t;
        ywa ywaVar = this.v;
        Object obj2 = this.u;
        switch (b) {
            case 0:
                px5 px5Var = px5.a;
                ybh.y(obj);
                for (osl oslVar : (List) obj2) {
                    ConstraintLayout constraintLayout = ywaVar.h0().a;
                    int i = oslVar.a.a;
                    WeakHashMap weakHashMap = r5n.a;
                    AppCompatImageView appCompatImageView = (View) m5n.f(constraintLayout, i);
                    Drawable drawable = appCompatImageView.getDrawable();
                    appCompatImageView.setVisibility(oslVar.b ? 0 : 8);
                    if (oslVar.c) {
                        int color = appCompatImageView.getContext().getColor(2131100286);
                        switch (pl7.a[PorterDuff.Mode.SRC_IN.ordinal()]) {
                            case 1:
                                lh3Var = lh3.MODULATE;
                                break;
                            case 2:
                                lh3Var = lh3.LIGHTEN;
                                break;
                            case 3:
                                lh3Var = lh3.CLEAR;
                                break;
                            case 4:
                                lh3Var = lh3.SRC;
                                break;
                            case 5:
                                lh3Var = lh3.DST;
                                break;
                            case 6:
                                lh3Var = lh3.SRC_OVER;
                                break;
                            case 7:
                                lh3Var = lh3.DST_OVER;
                                break;
                            case 8:
                                lh3Var = lh3.SRC_IN;
                                break;
                            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                                lh3Var = lh3.DST_IN;
                                break;
                            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                                lh3Var = lh3.SRC_OUT;
                                break;
                            case 11:
                                lh3Var = lh3.DST_OUT;
                                break;
                            case 12:
                                lh3Var = lh3.SRC_ATOP;
                                break;
                            case 13:
                                lh3Var = lh3.DST_ATOP;
                                break;
                            case 14:
                                lh3Var = lh3.XOR;
                                break;
                            case 15:
                                lh3Var = lh3.DARKEN;
                                break;
                            case 16:
                                lh3Var = lh3.SCREEN;
                                break;
                            case 17:
                                lh3Var = lh3.PLUS;
                                break;
                            case SizeUtil.textSize0_1 /* 18 */:
                                lh3Var = lh3.OVERLAY;
                                break;
                            default:
                                h9o.p();
                                break;
                        }
                        BlendMode blendModeR = qyn.R(lh3Var);
                        drawable.setColorFilter(blendModeR != null ? new BlendModeColorFilter(color, blendModeR) : null);
                        appCompatImageView.setBackgroundResource(2131231719);
                    } else {
                        drawable.clearColorFilter();
                        appCompatImageView.setBackgroundResource(2131231720);
                    }
                }
                break;
            case 1:
                iea ieaVar = (iea) obj2;
                px5 px5Var2 = px5.a;
                ybh.y(obj);
                ywaVar.h0().g.setEnabled(ieaVar.a);
                ywaVar.h0().f.setEnabled(ieaVar.b);
                ywaVar.h0().k.setVisibility(ieaVar.c ? 0 : 8);
                break;
            case 2:
                s5h s5hVar = (s5h) obj2;
                px5 px5Var3 = px5.a;
                ybh.y(obj);
                Context contextRequireContext = ywaVar.requireContext();
                int color2 = contextRequireContext.getColor(s5hVar.a.b);
                n8g n8gVar = s5hVar.f;
                int color3 = n8gVar == null ? 0 : contextRequireContext.getColor(n8gVar.b);
                ywaVar.h0().e.n.b.g(o8g.d[0], Integer.valueOf(color2));
                ywaVar.h0().e.p.g(EditImage.s[0], new bt7(color2, s5hVar.b, s5hVar.c, s5hVar.d, s5hVar.e, color3));
                break;
            default:
                nsl nslVar = (nsl) obj2;
                px5 px5Var4 = px5.a;
                ybh.y(obj);
                if (nslVar == null) {
                    ywaVar.h0().e.j(at7.f);
                    break;
                } else {
                    EditImage editImage = ywaVar.h0().e;
                    int iOrdinal = nslVar.ordinal();
                    if (iOrdinal == 0) {
                        at7Var = at7.b;
                    } else if (iOrdinal == 1 || iOrdinal == 2) {
                        at7Var = at7.c;
                    } else if (iOrdinal == 3) {
                        at7Var = at7.a;
                    } else if (iOrdinal == 4) {
                        at7Var = at7.d;
                    } else if (iOrdinal != 5) {
                        h9o.p();
                        break;
                    } else {
                        at7Var = at7.e;
                    }
                    editImage.j(at7Var);
                    break;
                }
                break;
        }
        return Unit.a;
    }
}
