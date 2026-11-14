package com.leanplum;

import defpackage.h1a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0004H\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/leanplum/LeanplumMessageDisplayControllers;", "", "()V", "displayController", "Lcom/leanplum/MessageDisplayController;", "getMessageDisplayController", "setMessageDisplayController", "", "messageDisplayController", "AndroidSDKCore_release"}, k = 1, mv = {1, h1a.ERROR_PRIVATE_FIELD_NUMBER, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LeanplumMessageDisplayControllers {

    @NotNull
    public static final LeanplumMessageDisplayControllers INSTANCE = new LeanplumMessageDisplayControllers();
    private static MessageDisplayController displayController;

    private LeanplumMessageDisplayControllers() {
    }

    public static final MessageDisplayController getMessageDisplayController() {
        return displayController;
    }

    public static final void setMessageDisplayController(@NotNull MessageDisplayController messageDisplayController) {
        displayController = messageDisplayController;
    }
}
