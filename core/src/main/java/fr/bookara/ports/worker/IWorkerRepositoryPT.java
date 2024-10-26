package fr.bookara.ports.worker;
import fr.bookara.domain.WorkerDN;

import java.net.UnknownHostException;
import java.sql.SQLException;

public interface IWorkerRepositoryPT {

    WorkerDN create(WorkerDN workerDN) throws UnknownHostException, SQLException;
}
