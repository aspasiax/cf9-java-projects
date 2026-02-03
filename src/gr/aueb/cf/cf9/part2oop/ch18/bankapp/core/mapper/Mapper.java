package gr.aueb.cf.cf9.part2oop.ch18.bankapp.core.mapper;

import gr.aueb.cf.cf9.part2oop.ch18.bankapp.dto.AccountInsertDTO;
import gr.aueb.cf.cf9.part2oop.ch18.bankapp.dto.AccountReadOnlyDTO;
import gr.aueb.cf.cf9.part2oop.ch18.bankapp.model.Account;

/**
 * Utility class responsible for Data Transformation (Mapping).
 * It converts between Data Transfer Objects (DTOs) and Domain Entities (Model).
 * This ensures decoupling between the presentation layer and the data layer.
 */
public class Mapper {

    /**
     * Private constructor to prevent instantiation of Utility class.
     */
    private Mapper() {}

    /**
     * Converts an Insert DTO to a Domain Entity.
     *
     * @param dto the data transfer object containing raw input data.
     * @return the populated Account entity.
     */
    public static Account mapToModelEntity(AccountInsertDTO dto) {
        return new Account(dto.iban(), dto.balance());
    }

    /**
     * Converts a Domain Entity to a Read-Only DTO.
     * Used to send data back to the client/view without exposing the entity directly.
     *
     * @param account the source entity.
     * @return the read-only DTO.
     */
    public static AccountReadOnlyDTO mapToReadOnly(Account account) {
        return new AccountReadOnlyDTO(account.getIban(), account.getBalance());
    }
}