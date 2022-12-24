package org.example.buckpal.account.application;

import org.example.buckpal.account.application.port.in.SendMoneyUseCase;
import org.example.buckpal.account.application.port.out.LoadAccountPort;
import org.example.buckpal.account.application.port.out.UpdateAccountStatePort;

public class SendMoneyService implements SendMoneyUseCase {
    private LoadAccountPort loadAccountPort;

    private UpdateAccountStatePort updateAccountStatePort;
}
