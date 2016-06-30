Create Table User (UserId Varchar(20), UserTypeId Varchar(20), FirstName Varchar(20), LastName Varchar(20), DOB Date, Phone Varchar(20), Mobile Varchar(20), Email Varchar(20), Gender  Varchar(20), AddressProofType Varchar(20), AddressProofImg Blob, IDProofType Varchar(20), IDNumber Varchar(20), IDProof Blob, CreatedDate Date, ModifiedDate Date)

Create Table UserType (UserTypeId Varchar(20), UserType Varchar(20))

Create Table Address (UserId Varchar(20), HouseNo Varchar(20), Street1 Varchar(20), Street2 Varchar(20), Landmark Varchar(20), City Varchar(20), State Varchar(20), Country Varchar(20), pincode Varchar(20))

Create Table Client  (UserId Varchar(20), ClientId Varchar(20), ServiceId Varchar(20), Description Varchar(20))

Create Table Volunteer (UserId Varchar(20), VolunteerId Varchar(20), ServiceId Varchar(20))

Create Table Ratifier (UserId Varchar(20), RatifierId Varchar(20), RatificationId Varchar(20))

Create Table Ratification (RatificationId Varchar(20), RatificationType Varchar(20), RatificationDesc Varchar(20))

Create Table Service_Type (ServiceTypeId Varchar(20), ServiceType Varchar(20), ServiceTypeDesc Varchar(20))

Create Table Service (ServiceId Varchar(20), ServiceTypeId Varchar(20), ServiceSubTypeId Varchar(20), ServiceDesc Varchar(20))

Create Table Service_SubType (ServiceTypeId Varchar(20), ServiceSubTypeId Varchar(20), ServiceSubType Varchar(20), ServcieSubTypeDesc Varchar(20))

Create Table Patron (UserId Varchar(20), PatronId Varchar(20), ServiceId Varchar(20), Ratify Boolean)

Create Table User_Ratify  (UserId Varchar(20), RatificationId Varchar(20), Ratified Boolean, RatificationLoc Varchar(20), RatificationDate Date, RatificationExpiry Date)

