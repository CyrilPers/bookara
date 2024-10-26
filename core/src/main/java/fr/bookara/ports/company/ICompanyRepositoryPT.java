package fr.bookara.ports.company;
import fr.bookara.domain.WorkerDN;

public interface ICompanyRepositoryPT {
    WorkerDN create(WorkerDN workerDN);
}
