insert into USUARIOS (id, username, password, role) values (100, 'ana@email.com', '$2a$12$2E9VJ/IUlkXdOocbnF/SIeQZ1lrQ.G.N4TQ0i99FEmnLRMewaCwqu', 'ROLE_ADMIN');
insert into USUARIOS (id, username, password, role) values (101, 'bia@email.com', '$2a$12$2E9VJ/IUlkXdOocbnF/SIeQZ1lrQ.G.N4TQ0i99FEmnLRMewaCwqu', 'ROLE_CLIENTE');
insert into USUARIOS (id, username, password, role) values (102, 'bob@email.com', '$2a$12$2E9VJ/IUlkXdOocbnF/SIeQZ1lrQ.G.N4TQ0i99FEmnLRMewaCwqu', 'ROLE_CLIENTE');
insert into USUARIOS (id, username, password, role) values (103, 'toby@email.com', '$2a$12$2E9VJ/IUlkXdOocbnF/SIeQZ1lrQ.G.N4TQ0i99FEmnLRMewaCwqu', 'ROLE_CLIENTE');

insert into CLIENTES (id, nome, cpf, id_usuario) values (10, 'Bianca Silva', '90637707079', 101);
insert into CLIENTES (id, nome, cpf, id_usuario) values (20, 'Roberto Gomes', '42032155010', 102);