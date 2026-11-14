package defpackage;

import ads_mobile_sdk.jz2;
import android.animation.ValueAnimator;
import android.graphics.PointF;
import android.os.SystemClock;
import android.util.Size;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import com.opera.android.widget.MeasurableHeightScrollView;
import org.chromium.components.browser_ui.modaldialog.ModalDialogView;

/* loaded from: classes.dex */
public final /* synthetic */ class m42 implements View.OnTouchListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m42(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        ValueAnimator valueAnimator;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ei eiVar = ((t42) obj).w;
                int action = motionEvent.getAction();
                if (action == 0) {
                    ((MeasurableHeightScrollView) eiVar.e).L = true;
                    break;
                } else if (action != 1 && action != 3) {
                    break;
                } else {
                    ((MeasurableHeightScrollView) eiVar.e).L = false;
                    break;
                }
            case 1:
                ni7 ni7Var = (ni7) obj;
                int i = ni7Var.s;
                ji7 ji7Var = ni7Var.x;
                PointF pointF = ni7Var.u;
                View view2 = ni7Var.a;
                boolean z = ni7Var.w;
                if (motionEvent.getAction() == 0) {
                    ni7Var.t = VelocityTracker.obtain();
                    pointF.set(motionEvent.getX(), motionEvent.getY());
                    ni7Var.v = new Size(view2.getWidth(), view2.getHeight());
                    VelocityTracker velocityTracker2 = ni7Var.t;
                    if (velocityTracker2 != null) {
                        ni7Var.a(velocityTracker2, motionEvent);
                    }
                }
                if (ni7Var.t != null) {
                    if (motionEvent.getAction() == 3 || ni7Var.v.getWidth() != view2.getWidth() || ni7Var.v.getHeight() != view2.getHeight()) {
                        VelocityTracker velocityTracker3 = ni7Var.t;
                        if (velocityTracker3 != null) {
                            velocityTracker3.recycle();
                        }
                        ni7Var.t = null;
                        ni7Var.w = false;
                        if (z) {
                            ni7Var.d.invoke(Boolean.FALSE);
                            ni7Var.k = false;
                            break;
                        }
                    } else if (motionEvent.getAction() != 1) {
                        if (motionEvent.getAction() == 2) {
                            VelocityTracker velocityTracker4 = ni7Var.t;
                            if (velocityTracker4 != null) {
                                ni7Var.a(velocityTracker4, motionEvent);
                            }
                            if (!ni7Var.w) {
                                float f = i;
                                if (Math.abs(motionEvent.getX() - pointF.x) > f || Math.abs(motionEvent.getY() - pointF.y) > f) {
                                    pointF.set(motionEvent.getX(), motionEvent.getY());
                                    ni7Var.w = true;
                                    ni7Var.c.invoke();
                                }
                            }
                            if (ni7Var.w) {
                                float x = (motionEvent.getX() + view2.getLeft()) - pointF.x;
                                float y = (motionEvent.getY() + view2.getTop()) - pointF.y;
                                boolean zF = ni7Var.f(x, y);
                                boolean z2 = ni7Var.k;
                                if (zF) {
                                    if (!z2) {
                                        ni7Var.e();
                                    }
                                } else if (!z2) {
                                    ji7Var.c(x, y);
                                } else if (z2) {
                                    view2.performHapticFeedback(0);
                                    ni7Var.k = false;
                                    ji7Var.c(x, y);
                                    ji7.b(ni7Var.x, mi7.c, ni7.A, new li7(), new wg5(ni7Var, (byte) 23), null, 16);
                                }
                                ni7Var.g();
                                break;
                            }
                        }
                    } else {
                        if (z && !ni7Var.k && (velocityTracker = ni7Var.t) != null) {
                            velocityTracker.computeCurrentVelocity(1000, ni7Var.r);
                            float xVelocity = velocityTracker.getXVelocity();
                            float yVelocity = velocityTracker.getYVelocity();
                            if (((float) Math.sqrt((yVelocity * yVelocity) + (xVelocity * xVelocity))) > ni7Var.q) {
                                float fFloatValue = (xVelocity / 10.0f) + ((Number) ni7Var.n.invoke()).floatValue();
                                float fFloatValue2 = (yVelocity / 10.0f) + ((Number) ni7Var.o.invoke()).floatValue();
                                if (ni7Var.f(fFloatValue, fFloatValue2)) {
                                    ni7Var.e();
                                } else {
                                    ji7Var.c(fFloatValue, fFloatValue2);
                                    ji7.b(ni7Var.x, mi7.d, ni7.B, null, null, ni7Var.f, 12);
                                }
                            }
                        }
                        VelocityTracker velocityTracker5 = ni7Var.t;
                        if (velocityTracker5 != null) {
                            velocityTracker5.recycle();
                        }
                        ni7Var.t = null;
                        ni7Var.w = false;
                        if (!z) {
                            view2.performClick();
                            break;
                        } else {
                            ValueAnimator valueAnimator2 = ji7Var.c;
                            if (((valueAnimator2 == null || !valueAnimator2.isRunning()) ? mi7.a : ji7Var.b) != mi7.b) {
                                ni7Var.d.invoke(Boolean.valueOf(ni7Var.k));
                                ni7Var.k = false;
                                break;
                            }
                        }
                    }
                } else {
                    break;
                }
                break;
            case 2:
                ym7 ym7Var = (ym7) obj;
                if (motionEvent.getAction() == 1) {
                    long jUptimeMillis = SystemClock.uptimeMillis() - ym7Var.o;
                    if (jUptimeMillis < 0 || jUptimeMillis > 300) {
                        ym7Var.m = false;
                    }
                    ym7Var.t();
                    ym7Var.m = true;
                    ym7Var.o = SystemClock.uptimeMillis();
                    break;
                }
                break;
            case 3:
                lrc lrcVar = (lrc) obj;
                int action2 = motionEvent.getAction();
                if (action2 == 0) {
                    or2 or2Var = lrcVar.B;
                    ((MeasurableHeightScrollView) (or2Var != null ? or2Var : null).e).L = true;
                    break;
                } else if (action2 != 1 && action2 != 3) {
                    break;
                } else {
                    or2 or2Var2 = lrcVar.B;
                    ((MeasurableHeightScrollView) (or2Var2 != null ? or2Var2 : null).e).L = false;
                    break;
                }
            case 4:
                break;
            case 5:
                ((nld) obj).c();
                break;
            case 6:
                int i2 = ModalDialogView.D;
                if ((motionEvent.getFlags() & 2) == 0) {
                    break;
                }
                break;
            case 7:
                knh knhVar = (knh) obj;
                int action3 = motionEvent.getAction();
                if (action3 == 0) {
                    knhVar.G = true;
                    knhVar.J0();
                    break;
                } else if (action3 != 1 && action3 != 3) {
                    break;
                } else {
                    knhVar.G = false;
                    knhVar.J0();
                    break;
                }
            case 8:
                ghf ghfVar = (ghf) obj;
                if (motionEvent.getAction() == 0 && (valueAnimator = (ValueAnimator) ghfVar.d) != null) {
                    valueAnimator.cancel();
                    break;
                }
                break;
            case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                mqn mqnVar = (mqn) obj;
                int action4 = motionEvent.getAction();
                if (action4 == 0) {
                    y83 y83Var = mqnVar.S;
                    ((MeasurableHeightScrollView) (y83Var != null ? y83Var : null).f).L = true;
                    break;
                } else if (action4 != 1 && action4 != 3) {
                    break;
                } else {
                    y83 y83Var2 = mqnVar.S;
                    ((MeasurableHeightScrollView) (y83Var2 != null ? y83Var2 : null).f).L = false;
                    break;
                }
            case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                ((jz2) obj).g.set(true);
                view.performClick();
                break;
            default:
                o7p o7pVar = (o7p) obj;
                jkp jkpVar = o7pVar.p;
                if (jkpVar != null) {
                    jkpVar.b(view, o7pVar.f(view), motionEvent);
                    break;
                }
                break;
        }
        return false;
    }
}
