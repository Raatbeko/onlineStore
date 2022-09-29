package online.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import online.dto.*;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderDto {
    List<ChildOrderDto> orders;
    private String phoneNumber;
    private String fullName;
    private String address;
    private String comment;

}
