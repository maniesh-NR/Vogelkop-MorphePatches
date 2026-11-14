package com.leanplum.messagetemplates;

import androidx.annotation.NonNull;
import com.leanplum.internal.Constants;
import com.leanplum.internal.ResourceQualifiers;
import com.leanplum.messagetemplates.OperaSubscriptionDialogRequest;
import defpackage.b2l;
import defpackage.d7l;
import defpackage.gg0;
import defpackage.ijm;
import defpackage.orm;
import defpackage.vb0;
import defpackage.wf5;
import defpackage.x5f;
import defpackage.xf5;
import defpackage.yf5;
import defpackage.zpa;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0002\u0017\u0018B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0017¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/leanplum/messagetemplates/OperaSubscriptionDialogRequest;", "Lyf5;", "Lcom/leanplum/messagetemplates/OperaSubscriptionDialogRequest$Model;", "model", "Lorm;", "usageReporter", "<init>", "(Lcom/leanplum/messagetemplates/OperaSubscriptionDialogRequest$Model;Lorm;)V", "Lb2l;", "activeTab", "", "isAllowed", "(Lb2l;)Z", "Lwf5;", "scope", "", "content", "(Lwf5;Lih5;I)V", "Lcom/leanplum/messagetemplates/OperaSubscriptionDialogRequest$Model;", "Lorm;", "", "numberOfButtons", "J", "Model", "Button", "app"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class OperaSubscriptionDialogRequest extends yf5 {
    public static final int $stable = yf5.$stable | ResourceWrapper.$stable;

    @NotNull
    private final Model model;
    private final long numberOfButtons;

    @NotNull
    private final orm usageReporter;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\u0006\u0010\u0015\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fÊ\u0001\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u0016"}, d2 = {"Lcom/leanplum/messagetemplates/OperaSubscriptionDialogRequest$Button;", "", "label", "", "action", "Lkotlin/Function0;", "", "<init>", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "getLabel", "()Ljava/lang/String;", "getAction", "()Lkotlin/jvm/functions/Function0;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Button {
        public static final int $stable = 0;

        @NotNull
        private final Function0<Unit> action;

        @NotNull
        private final String label;

        public Button(@NotNull String str, @NotNull Function0<Unit> function0) {
            this.label = str;
            this.action = function0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Button copy$default(Button button, String str, Function0 function0, int i, Object obj) {
            if ((i & 1) != 0) {
                str = button.label;
            }
            if ((i & 2) != 0) {
                function0 = button.action;
            }
            return button.copy(str, function0);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        @NotNull
        public final Function0<Unit> component2() {
            return this.action;
        }

        @NotNull
        public final Button copy(@NotNull String label, @NotNull Function0<Unit> action) {
            return new Button(label, action);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Button)) {
                return false;
            }
            Button button = (Button) other;
            return Intrinsics.a(this.label, button.label) && Intrinsics.a(this.action, button.action);
        }

        @NotNull
        public final Function0<Unit> getAction() {
            return this.action;
        }

        @NotNull
        public final String getLabel() {
            return this.label;
        }

        public int hashCode() {
            return this.action.hashCode() + (this.label.hashCode() * 31);
        }

        @NotNull
        public final String toString() {
            return "";
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u001b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010$\u001a\u00020\nHÆ\u0003J\t\u0010%\u001a\u00020\fHÆ\u0003J\u0011\u0010&\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0003Je\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0001J\u0014\u0010(\u001a\u00020\f2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010*\u001a\u00020+HÖ\u0081\u0004J\u0006\u0010,\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eÊ\u0001\f\b.\u0012\b\b/\u0012\u0004\b\u0003\u0010\u0000¨\u0006-"}, d2 = {"Lcom/leanplum/messagetemplates/OperaSubscriptionDialogRequest$Model;", "", "id", "", "title", Constants.Params.MESSAGE, "primaryButton", "Lcom/leanplum/messagetemplates/OperaSubscriptionDialogRequest$Button;", "secondaryButton", "resourceWrapper", "Lcom/leanplum/messagetemplates/ResourceWrapper;", "fullWidthButtons", "", "closeButtonAction", "Lkotlin/Function0;", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/leanplum/messagetemplates/OperaSubscriptionDialogRequest$Button;Lcom/leanplum/messagetemplates/OperaSubscriptionDialogRequest$Button;Lcom/leanplum/messagetemplates/ResourceWrapper;ZLkotlin/jvm/functions/Function0;)V", "getId", "()Ljava/lang/String;", "getTitle", "getMessage", "getPrimaryButton", "()Lcom/leanplum/messagetemplates/OperaSubscriptionDialogRequest$Button;", "getSecondaryButton", "getResourceWrapper", "()Lcom/leanplum/messagetemplates/ResourceWrapper;", "getFullWidthButtons", "()Z", "getCloseButtonAction", "()Lkotlin/jvm/functions/Function0;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "app", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Model {
        public static final int $stable = ResourceWrapper.$stable;
        private final Function0<Unit> closeButtonAction;
        private final boolean fullWidthButtons;

        @NotNull
        private final String id;

        @NotNull
        private final String message;
        private final Button primaryButton;

        @NotNull
        private final ResourceWrapper resourceWrapper;
        private final Button secondaryButton;

        @NotNull
        private final String title;

        public Model(@NotNull String str, @NotNull String str2, @NotNull String str3, Button button, Button button2, @NotNull ResourceWrapper resourceWrapper, boolean z, Function0<Unit> function0) {
            this.id = str;
            this.title = str2;
            this.message = str3;
            this.primaryButton = button;
            this.secondaryButton = button2;
            this.resourceWrapper = resourceWrapper;
            this.fullWidthButtons = z;
            this.closeButtonAction = function0;
        }

        public static /* synthetic */ Model copy$default(Model model, String str, String str2, String str3, Button button, Button button2, ResourceWrapper resourceWrapper, boolean z, Function0 function0, int i, Object obj) {
            if ((i & 1) != 0) {
                str = model.id;
            }
            if ((i & 2) != 0) {
                str2 = model.title;
            }
            if ((i & 4) != 0) {
                str3 = model.message;
            }
            if ((i & 8) != 0) {
                button = model.primaryButton;
            }
            if ((i & 16) != 0) {
                button2 = model.secondaryButton;
            }
            if ((i & 32) != 0) {
                resourceWrapper = model.resourceWrapper;
            }
            if ((i & 64) != 0) {
                z = model.fullWidthButtons;
            }
            if ((i & ResourceQualifiers.Qualifier.AnonymousClass5.SCREENLAYOUT_LAYOUTDIR_RTL) != 0) {
                function0 = model.closeButtonAction;
            }
            boolean z2 = z;
            Function0 function02 = function0;
            Button button3 = button2;
            ResourceWrapper resourceWrapper2 = resourceWrapper;
            return model.copy(str, str2, str3, button, button3, resourceWrapper2, z2, function02);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        /* renamed from: component4, reason: from getter */
        public final Button getPrimaryButton() {
            return this.primaryButton;
        }

        /* renamed from: component5, reason: from getter */
        public final Button getSecondaryButton() {
            return this.secondaryButton;
        }

        @NotNull
        /* renamed from: component6, reason: from getter */
        public final ResourceWrapper getResourceWrapper() {
            return this.resourceWrapper;
        }

        /* renamed from: component7, reason: from getter */
        public final boolean getFullWidthButtons() {
            return this.fullWidthButtons;
        }

        public final Function0<Unit> component8() {
            return this.closeButtonAction;
        }

        @NotNull
        public final Model copy(@NotNull String id, @NotNull String title, @NotNull String message, Button primaryButton, Button secondaryButton, @NotNull ResourceWrapper resourceWrapper, boolean fullWidthButtons, Function0<Unit> closeButtonAction) {
            return new Model(id, title, message, primaryButton, secondaryButton, resourceWrapper, fullWidthButtons, closeButtonAction);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Model)) {
                return false;
            }
            Model model = (Model) other;
            return Intrinsics.a(this.id, model.id) && Intrinsics.a(this.title, model.title) && Intrinsics.a(this.message, model.message) && Intrinsics.a(this.primaryButton, model.primaryButton) && Intrinsics.a(this.secondaryButton, model.secondaryButton) && Intrinsics.a(this.resourceWrapper, model.resourceWrapper) && this.fullWidthButtons == model.fullWidthButtons && Intrinsics.a(this.closeButtonAction, model.closeButtonAction);
        }

        public final Function0<Unit> getCloseButtonAction() {
            return this.closeButtonAction;
        }

        public final boolean getFullWidthButtons() {
            return this.fullWidthButtons;
        }

        @NotNull
        public final String getId() {
            return this.id;
        }

        @NotNull
        public final String getMessage() {
            return this.message;
        }

        public final Button getPrimaryButton() {
            return this.primaryButton;
        }

        @NotNull
        public final ResourceWrapper getResourceWrapper() {
            return this.resourceWrapper;
        }

        public final Button getSecondaryButton() {
            return this.secondaryButton;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            int iF = z1m.f(z1m.f(this.id.hashCode() * 31, 31, this.title), 31, this.message);
            Button button = this.primaryButton;
            int iHashCode = (iF + (button == null ? 0 : button.hashCode())) * 31;
            Button button2 = this.secondaryButton;
            int iK = fki.k((this.resourceWrapper.hashCode() + ((iHashCode + (button2 == null ? 0 : button2.hashCode())) * 31)) * 31, 31, this.fullWidthButtons);
            Function0<Unit> function0 = this.closeButtonAction;
            return iK + (function0 != null ? function0.hashCode() : 0);
        }

        @NotNull
        public final String toString() {
            return "";
        }
    }

    public OperaSubscriptionDialogRequest(@NotNull Model model, @NotNull orm ormVar) {
        this.model = model;
        this.usageReporter = ormVar;
        this.numberOfButtons = ((ArrayList) e82.p(new Object[]{model.getPrimaryButton(), model.getSecondaryButton(), model.getCloseButtonAction()})).size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit content$lambda$0$0(OperaSubscriptionDialogRequest operaSubscriptionDialogRequest, wf5 wf5Var) {
        orm ormVar = operaSubscriptionDialogRequest.usageReporter;
        ((x5f) ormVar).Y(gg0.j, vb0.d, operaSubscriptionDialogRequest.numberOfButtons, operaSubscriptionDialogRequest.model.getResourceWrapper().status, operaSubscriptionDialogRequest.model.getId());
        ((xf5) wf5Var).a.finish(hjm.b);
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit content$lambda$1$0(OperaSubscriptionDialogRequest operaSubscriptionDialogRequest, wf5 wf5Var) {
        orm ormVar = operaSubscriptionDialogRequest.usageReporter;
        ((x5f) ormVar).Y(gg0.j, vb0.b, operaSubscriptionDialogRequest.numberOfButtons, operaSubscriptionDialogRequest.model.getResourceWrapper().status, operaSubscriptionDialogRequest.model.getId());
        ((xf5) wf5Var).a();
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit content$lambda$2$0(OperaSubscriptionDialogRequest operaSubscriptionDialogRequest, wf5 wf5Var) {
        orm ormVar = operaSubscriptionDialogRequest.usageReporter;
        ((x5f) ormVar).Y(gg0.j, vb0.c, operaSubscriptionDialogRequest.numberOfButtons, operaSubscriptionDialogRequest.model.getResourceWrapper().status, operaSubscriptionDialogRequest.model.getId());
        ((xf5) wf5Var).a();
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit content$lambda$3$0(OperaSubscriptionDialogRequest operaSubscriptionDialogRequest, wf5 wf5Var) {
        orm ormVar = operaSubscriptionDialogRequest.usageReporter;
        ((x5f) ormVar).Y(gg0.j, vb0.c, operaSubscriptionDialogRequest.numberOfButtons, operaSubscriptionDialogRequest.model.getResourceWrapper().status, operaSubscriptionDialogRequest.model.getId());
        ((xf5) wf5Var).a();
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit content$lambda$4(OperaSubscriptionDialogRequest operaSubscriptionDialogRequest, wf5 wf5Var, int i, ih5 ih5Var, int i2) {
        operaSubscriptionDialogRequest.content(wf5Var, ih5Var, aoh.m(i | 1));
        return Unit.a;
    }

    @Override // defpackage.yf5
    public void content(@NotNull final wf5 wf5Var, ih5 ih5Var, int i) {
        int i2;
        vt9 vt9Var = (vt9) ih5Var;
        vt9Var.Y(877595504);
        final byte b = 2;
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? vt9Var.f(wf5Var) : vt9Var.h(wf5Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? vt9Var.f(this) : vt9Var.h(this) ? 32 : 16;
        }
        final byte b2 = 0;
        final byte b3 = 1;
        if (vt9Var.N(i2 & 1, (i2 & 19) != 18)) {
            int i3 = i2 & 112;
            int i4 = i2 & 14;
            boolean z = (i3 == 32 || ((i2 & 64) != 0 && vt9Var.h(this))) | (i4 == 4 || ((i2 & 8) != 0 && vt9Var.h(wf5Var)));
            Object objK = vt9Var.K();
            zpa zpaVar = hh5.a;
            if (z || objK == zpaVar) {
                objK = new Function0(this) { // from class: hof
                    public final /* synthetic */ OperaSubscriptionDialogRequest b;

                    {
                        this.b = this;
                    }

                    public final Object invoke() {
                        byte b4 = b2;
                        wf5 wf5Var2 = wf5Var;
                        OperaSubscriptionDialogRequest operaSubscriptionDialogRequest = this.b;
                        switch (b4) {
                            case 0:
                                return OperaSubscriptionDialogRequest.content$lambda$0$0(operaSubscriptionDialogRequest, wf5Var2);
                            case 1:
                                return OperaSubscriptionDialogRequest.content$lambda$1$0(operaSubscriptionDialogRequest, wf5Var2);
                            case 2:
                                return OperaSubscriptionDialogRequest.content$lambda$2$0(operaSubscriptionDialogRequest, wf5Var2);
                            default:
                                return OperaSubscriptionDialogRequest.content$lambda$3$0(operaSubscriptionDialogRequest, wf5Var2);
                        }
                    }
                };
                vt9Var.g0(objK);
            }
            Function0 function0 = (Function0) objK;
            Model model = this.model;
            boolean z2 = (i3 == 32 || ((i2 & 64) != 0 && vt9Var.h(this))) | (i4 == 4 || ((i2 & 8) != 0 && vt9Var.h(wf5Var)));
            Object objK2 = vt9Var.K();
            if (z2 || objK2 == zpaVar) {
                objK2 = new Function0(this) { // from class: hof
                    public final /* synthetic */ OperaSubscriptionDialogRequest b;

                    {
                        this.b = this;
                    }

                    public final Object invoke() {
                        byte b4 = b3;
                        wf5 wf5Var2 = wf5Var;
                        OperaSubscriptionDialogRequest operaSubscriptionDialogRequest = this.b;
                        switch (b4) {
                            case 0:
                                return OperaSubscriptionDialogRequest.content$lambda$0$0(operaSubscriptionDialogRequest, wf5Var2);
                            case 1:
                                return OperaSubscriptionDialogRequest.content$lambda$1$0(operaSubscriptionDialogRequest, wf5Var2);
                            case 2:
                                return OperaSubscriptionDialogRequest.content$lambda$2$0(operaSubscriptionDialogRequest, wf5Var2);
                            default:
                                return OperaSubscriptionDialogRequest.content$lambda$3$0(operaSubscriptionDialogRequest, wf5Var2);
                        }
                    }
                };
                vt9Var.g0(objK2);
            }
            Function0 function02 = (Function0) objK2;
            boolean z3 = (i3 == 32 || ((i2 & 64) != 0 && vt9Var.h(this))) | (i4 == 4 || ((i2 & 8) != 0 && vt9Var.h(wf5Var)));
            Object objK3 = vt9Var.K();
            if (z3 || objK3 == zpaVar) {
                objK3 = new Function0(this) { // from class: hof
                    public final /* synthetic */ OperaSubscriptionDialogRequest b;

                    {
                        this.b = this;
                    }

                    public final Object invoke() {
                        byte b4 = b;
                        wf5 wf5Var2 = wf5Var;
                        OperaSubscriptionDialogRequest operaSubscriptionDialogRequest = this.b;
                        switch (b4) {
                            case 0:
                                return OperaSubscriptionDialogRequest.content$lambda$0$0(operaSubscriptionDialogRequest, wf5Var2);
                            case 1:
                                return OperaSubscriptionDialogRequest.content$lambda$1$0(operaSubscriptionDialogRequest, wf5Var2);
                            case 2:
                                return OperaSubscriptionDialogRequest.content$lambda$2$0(operaSubscriptionDialogRequest, wf5Var2);
                            default:
                                return OperaSubscriptionDialogRequest.content$lambda$3$0(operaSubscriptionDialogRequest, wf5Var2);
                        }
                    }
                };
                vt9Var.g0(objK3);
            }
            Function0 function03 = (Function0) objK3;
            boolean z4 = (i3 == 32 || ((i2 & 64) != 0 && vt9Var.h(this))) | (i4 == 4 || ((i2 & 8) != 0 && vt9Var.h(wf5Var)));
            Object objK4 = vt9Var.K();
            final byte b4 = 3;
            Object obj = objK4;
            if (z4 || objK4 == zpaVar) {
                Function0 function04 = new Function0(this) { // from class: hof
                    public final /* synthetic */ OperaSubscriptionDialogRequest b;

                    {
                        this.b = this;
                    }

                    public final Object invoke() {
                        byte b42 = b4;
                        wf5 wf5Var2 = wf5Var;
                        OperaSubscriptionDialogRequest operaSubscriptionDialogRequest = this.b;
                        switch (b42) {
                            case 0:
                                return OperaSubscriptionDialogRequest.content$lambda$0$0(operaSubscriptionDialogRequest, wf5Var2);
                            case 1:
                                return OperaSubscriptionDialogRequest.content$lambda$1$0(operaSubscriptionDialogRequest, wf5Var2);
                            case 2:
                                return OperaSubscriptionDialogRequest.content$lambda$2$0(operaSubscriptionDialogRequest, wf5Var2);
                            default:
                                return OperaSubscriptionDialogRequest.content$lambda$3$0(operaSubscriptionDialogRequest, wf5Var2);
                        }
                    }
                };
                vt9Var.g0(function04);
                obj = function04;
            }
            OperaSubscriptionDialogRequestKt.SubscriptionDialog(function0, model, function02, function03, (Function0) obj, vt9Var, ResourceWrapper.$stable << 3);
        } else {
            vt9Var.Q();
        }
        znh znhVarR = vt9Var.r();
        if (znhVarR != null) {
            znhVarR.d = new uf1(this, wf5Var, i, (byte) 9);
        }
    }

    @Override // defpackage.jjm
    @NonNull
    public /* bridge */ /* synthetic */ ijm getDefaultPriority() {
        return ijm.b;
    }

    @Override // defpackage.b87
    public boolean isAllowed(b2l activeTab) {
        return activeTab == null || !((d7l) activeTab).j.m();
    }
}
