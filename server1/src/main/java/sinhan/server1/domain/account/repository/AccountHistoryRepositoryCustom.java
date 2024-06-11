package sinhan.server1.domain.account.repository;

import sinhan.server1.domain.account.entity.Account;
import sinhan.server1.domain.account.entity.AccountHistory;
import sinhan.server1.domain.tempuser.TempUser;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public interface AccountHistoryRepositoryCustom {
    List<AccountHistory> findByUserAndCreateDateBetween(Account account , LocalDateTime start, LocalDateTime end);
}
