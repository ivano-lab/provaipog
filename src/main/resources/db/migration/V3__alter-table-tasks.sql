-- Alterando o tipo do campo `id` de UUID para TEXT

ALTER TABLE tasks
ALTER COLUMN id TYPE TEXT;
